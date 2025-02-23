package org.msync.machine_learning.tools

import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_BYTE

fun main(args: Array<String>) {

    // Explore the linker
    val linker = Linker.nativeLinker()
    for (lc in linker.canonicalLayouts()) {
        println(lc)
    }

    val pattern = "************"
    val stdlib = linker.defaultLookup()
    val strdup_addr = stdlib.find("strdup").get()
    val stringLayout = MemoryLayout.sequenceLayout(Long.MAX_VALUE, JAVA_BYTE)
    val strdup_sig = FunctionDescriptor.of(
        ValueLayout.ADDRESS.withTargetLayout(stringLayout),
        ValueLayout.ADDRESS.withTargetLayout(stringLayout)
    )
    val strdup_handle = linker.downcallHandle(strdup_addr, strdup_sig)
    Arena.ofConfined().use { arena ->
        val nativeString: MemorySegment = arena.allocateFrom(pattern)
        val duplicatedNativeString = strdup_handle.invokeExact(nativeString) as MemorySegment
        for (i in pattern.length.downTo(1)) {
            println(duplicatedNativeString.getString(i.toLong()))
        }
    }
}
