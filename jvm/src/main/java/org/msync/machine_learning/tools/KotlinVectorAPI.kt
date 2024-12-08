package org.msync.machine_learning.tools

import jdk.incubator.vector.IntVector
import jdk.incubator.vector.VectorSpecies

internal object KotlinVectorAPI {
    val SPECIES: VectorSpecies<Int> = IntVector.SPECIES_PREFERRED

    fun <T> timeExecution(block: () -> T): Pair<T, Long> {
        val startTime = System.nanoTime()
        val result = block()
        val endTime = System.nanoTime()
        return Pair(result, endTime - startTime)
    }

    fun addScalarArrays(a: IntArray, b: IntArray): IntArray {
        val result = IntArray(a.size)
        for (i in a.indices) {
            result[i] = a[i] + b[i]
        }
        return result
    }

    fun addVectorArrays(a: IntVector, b: IntVector?): IntVector = a.add(b)

    @JvmStatic
    fun main(args: Array<String>) {
        val arrayLen = 10000
        val loopCount = 100000
        var result = IntArray(arrayLen)

        var runTime = timeExecution {
            for (count in 0 until loopCount) {
                val a = serialInts(arrayLen, count)
                val b = serialInts(arrayLen, count)
                result = addScalarArrays(a, b)
            }
        }

        println("KT: Time taken for scalar addition: ${runTime.second}")

        runTime = timeExecution {
            for (count in 0 until loopCount) {
                val a = serialInts(arrayLen, count)
                val b = serialInts(arrayLen, count)
                val va = IntVector.fromArray(SPECIES, a, 0)
                val vb = IntVector.fromArray(SPECIES, b, 0)
                addVectorArrays(va, vb).intoArray(result, 0)
            }
        }
        println("KT: Time taken for vector addition: ${runTime.second}")
    }

    private fun serialInts(arrayLen: Int, base: Int): IntArray {
        val result = IntArray(arrayLen)
        for (i in 0 until arrayLen) {
            result[i] = i + base
        }
        return result
    }
}
