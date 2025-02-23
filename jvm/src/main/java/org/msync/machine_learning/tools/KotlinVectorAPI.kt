package org.msync.machine_learning.tools

import jdk.incubator.vector.IntVector
import jdk.incubator.vector.VectorOperators
import jdk.incubator.vector.VectorSpecies

internal object KotlinVectorAPI {
    val SPECIES: VectorSpecies<Int> = IntVector.SPECIES_PREFERRED

    fun sampleDotProduct() {
        val a = serialInts(5, 1)
        val b = serialInts(5, 10)
        val va = IntVector.fromArray(SPECIES, a, 0)
        val vb = IntVector.fromArray(SPECIES, b, 0)
        println(va)
        println(vb)
        println(dot(va, vb))
    }

    fun <T> timeExecution(block: () -> T): Pair<T, Long> {
        val startTime = System.nanoTime()
        val result = block()
        val endTime = System.nanoTime()
        return Pair(result, endTime - startTime)
    }

    fun add(a: IntArray, b: IntArray): IntArray {
        val result = IntArray(a.size)
        for (i in a.indices) {
            result[i] = a[i] + b[i]
        }
        return result
    }

    fun add(a: IntVector, b: IntVector?): IntVector = a.add(b)

    fun dot(a: IntVector, b: IntVector): Int {
        assert(a.elementSize() == b.elementSize())
        return a.mul(b).reduceLanes(VectorOperators.ADD)
    }

    fun dot(a: IntArray, b: IntArray): Long {
        assert(a.size == b.size)
        var result = 0L
        for (i in a.indices) {
            result += a[i] * b[i]
        }
        return result
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val arrayLen = 10000
        val loopCount = 100000
        var result = IntArray(arrayLen)

        val runTime1 = timeExecution {
            for (count in 0 until loopCount) {
                val a = serialInts(arrayLen, count)
                val b = serialInts(arrayLen, count)
                result = add(a, b)
            }
        }

        println("KT: Time taken for scalar addition: ${runTime1.second}")

        val runTime2 = timeExecution {
            for (count in 0 until loopCount) {
                val a = serialInts(arrayLen, count)
                val b = serialInts(arrayLen, count)
                val va = IntVector.fromArray(SPECIES, a, 0)
                val vb = IntVector.fromArray(SPECIES, b, 0)
                add(va, vb).intoArray(result, 0)
            }
        }
        println("KT: Time taken for vector addition: ${runTime2.second}")

        println("Speedup: ${runTime1.second * 1.0 / runTime2.second}")

        val runTime3 = timeExecution {
            val b = serialInts(arrayLen, loopCount)
            val a = serialInts(arrayLen, loopCount)
            for (count in 0 until loopCount) {
                val result = dot(a, b)
            }
        }
        println("KT: Time taken for loop dot: ${runTime3.second}")

        val runTime4 = timeExecution {
            val a = serialInts(arrayLen, loopCount)
            val b = serialInts(arrayLen, loopCount)
            val va = IntVector.fromArray(SPECIES, a, 0)
            val vb = IntVector.fromArray(SPECIES, b, 0)
            for (count in 0 until loopCount) {
                val result = dot(va, vb)
            }
        }
        println("KT: Time taken for vector dot: ${runTime4.second}")
        println("Speedup: ${runTime3.second * 1.0 / runTime4.second}")

    }

    private fun serialInts(arrayLen: Int, base: Int): IntArray {
        val result = IntArray(arrayLen)
        for (i in 0 until arrayLen) {
            result[i] = i + base
        }
        return result
    }
}
