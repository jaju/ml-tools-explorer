// Generated by jextract

package org.python;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct {
 *     PyObject *_co_code;
 *     PyObject *_co_varnames;
 *     PyObject *_co_cellvars;
 *     PyObject *_co_freevars;
 * }
 * }
 */
public class _PyCoCached {

    _PyCoCached() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Python_h.C_POINTER.withName("_co_code"),
        Python_h.C_POINTER.withName("_co_varnames"),
        Python_h.C_POINTER.withName("_co_cellvars"),
        Python_h.C_POINTER.withName("_co_freevars")
    ).withName("$anon$28:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout _co_code$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_co_code"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PyObject *_co_code
     * }
     */
    public static final AddressLayout _co_code$layout() {
        return _co_code$LAYOUT;
    }

    private static final long _co_code$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PyObject *_co_code
     * }
     */
    public static final long _co_code$offset() {
        return _co_code$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PyObject *_co_code
     * }
     */
    public static MemorySegment _co_code(MemorySegment struct) {
        return struct.get(_co_code$LAYOUT, _co_code$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PyObject *_co_code
     * }
     */
    public static void _co_code(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_co_code$LAYOUT, _co_code$OFFSET, fieldValue);
    }

    private static final AddressLayout _co_varnames$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_co_varnames"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PyObject *_co_varnames
     * }
     */
    public static final AddressLayout _co_varnames$layout() {
        return _co_varnames$LAYOUT;
    }

    private static final long _co_varnames$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PyObject *_co_varnames
     * }
     */
    public static final long _co_varnames$offset() {
        return _co_varnames$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PyObject *_co_varnames
     * }
     */
    public static MemorySegment _co_varnames(MemorySegment struct) {
        return struct.get(_co_varnames$LAYOUT, _co_varnames$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PyObject *_co_varnames
     * }
     */
    public static void _co_varnames(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_co_varnames$LAYOUT, _co_varnames$OFFSET, fieldValue);
    }

    private static final AddressLayout _co_cellvars$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_co_cellvars"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PyObject *_co_cellvars
     * }
     */
    public static final AddressLayout _co_cellvars$layout() {
        return _co_cellvars$LAYOUT;
    }

    private static final long _co_cellvars$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PyObject *_co_cellvars
     * }
     */
    public static final long _co_cellvars$offset() {
        return _co_cellvars$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PyObject *_co_cellvars
     * }
     */
    public static MemorySegment _co_cellvars(MemorySegment struct) {
        return struct.get(_co_cellvars$LAYOUT, _co_cellvars$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PyObject *_co_cellvars
     * }
     */
    public static void _co_cellvars(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_co_cellvars$LAYOUT, _co_cellvars$OFFSET, fieldValue);
    }

    private static final AddressLayout _co_freevars$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_co_freevars"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PyObject *_co_freevars
     * }
     */
    public static final AddressLayout _co_freevars$layout() {
        return _co_freevars$LAYOUT;
    }

    private static final long _co_freevars$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PyObject *_co_freevars
     * }
     */
    public static final long _co_freevars$offset() {
        return _co_freevars$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PyObject *_co_freevars
     * }
     */
    public static MemorySegment _co_freevars(MemorySegment struct) {
        return struct.get(_co_freevars$LAYOUT, _co_freevars$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PyObject *_co_freevars
     * }
     */
    public static void _co_freevars(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_co_freevars$LAYOUT, _co_freevars$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

