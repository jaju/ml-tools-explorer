package org.msync.machine_learning.tools

import jdk.incubator.vector.IntVector
import jdk.incubator.vector.VectorSpecies
import java.util.*
import java.util.stream.IntStream

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

    fun addVectorArrays(a: IntVector, b: IntVector?) = a.add(b)

    @JvmStatic
    fun main(args: Array<String>) {
        val arrayLen = 10000
        val loop_count = 100000
        val a = IntStream.generate { Random().nextInt(100) }.limit(arrayLen.toLong()).toArray()
        val b = IntStream.generate { Random().nextInt(100) }.limit(arrayLen.toLong()).toArray()

        var runTime = timeExecution {
            for (count in 0 until loop_count) {
                val sum = addScalarArrays(a, b)
            }
        }

        println("KT: Time taken for scalar addition: ${runTime.second}")

        val va = IntVector.fromArray(SPECIES, a, 0)
        val vb = IntVector.fromArray(SPECIES, b, 0)
        runTime = timeExecution {
            for (count in 0 until loop_count) {
                val vr = addVectorArrays(va, vb)
                val result2 = IntArray(4)
                vr.intoArray(result2, 0)
                if (count % 1000 == 0) {
                    if (count % 10000 == 0) {
                        println(count)
                    } else {
                        print(".")
                    }
                }
            }
            println("Done loops: $loop_count")
        }
        println("KT: Time taken for vector addition: ${runTime.second}")
    }
}
