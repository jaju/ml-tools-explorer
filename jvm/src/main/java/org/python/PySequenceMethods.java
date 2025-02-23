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
 *     lenfunc sq_length;
 *     binaryfunc sq_concat;
 *     ssizeargfunc sq_repeat;
 *     ssizeargfunc sq_item;
 *     void *was_sq_slice;
 *     ssizeobjargproc sq_ass_item;
 *     void *was_sq_ass_slice;
 *     objobjproc sq_contains;
 *     binaryfunc sq_inplace_concat;
 *     ssizeargfunc sq_inplace_repeat;
 * }
 * }
 */
public class PySequenceMethods {

    PySequenceMethods() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Python_h.C_POINTER.withName("sq_length"),
        Python_h.C_POINTER.withName("sq_concat"),
        Python_h.C_POINTER.withName("sq_repeat"),
        Python_h.C_POINTER.withName("sq_item"),
        Python_h.C_POINTER.withName("was_sq_slice"),
        Python_h.C_POINTER.withName("sq_ass_item"),
        Python_h.C_POINTER.withName("was_sq_ass_slice"),
        Python_h.C_POINTER.withName("sq_contains"),
        Python_h.C_POINTER.withName("sq_inplace_concat"),
        Python_h.C_POINTER.withName("sq_inplace_repeat")
    ).withName("$anon$107:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout sq_length$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("sq_length"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * lenfunc sq_length
     * }
     */
    public static final AddressLayout sq_length$layout() {
        return sq_length$LAYOUT;
    }

    private static final long sq_length$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * lenfunc sq_length
     * }
     */
    public static final long sq_length$offset() {
        return sq_length$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * lenfunc sq_length
     * }
     */
    public static MemorySegment sq_length(MemorySegment struct) {
        return struct.get(sq_length$LAYOUT, sq_length$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * lenfunc sq_length
     * }
     */
    public static void sq_length(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sq_length$LAYOUT, sq_length$OFFSET, fieldValue);
    }

    private static final AddressLayout sq_concat$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("sq_concat"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * binaryfunc sq_concat
     * }
     */
    public static final AddressLayout sq_concat$layout() {
        return sq_concat$LAYOUT;
    }

    private static final long sq_concat$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * binaryfunc sq_concat
     * }
     */
    public static final long sq_concat$offset() {
        return sq_concat$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * binaryfunc sq_concat
     * }
     */
    public static MemorySegment sq_concat(MemorySegment struct) {
        return struct.get(sq_concat$LAYOUT, sq_concat$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * binaryfunc sq_concat
     * }
     */
    public static void sq_concat(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sq_concat$LAYOUT, sq_concat$OFFSET, fieldValue);
    }

    private static final AddressLayout sq_repeat$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("sq_repeat"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ssizeargfunc sq_repeat
     * }
     */
    public static final AddressLayout sq_repeat$layout() {
        return sq_repeat$LAYOUT;
    }

    private static final long sq_repeat$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ssizeargfunc sq_repeat
     * }
     */
    public static final long sq_repeat$offset() {
        return sq_repeat$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ssizeargfunc sq_repeat
     * }
     */
    public static MemorySegment sq_repeat(MemorySegment struct) {
        return struct.get(sq_repeat$LAYOUT, sq_repeat$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ssizeargfunc sq_repeat
     * }
     */
    public static void sq_repeat(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sq_repeat$LAYOUT, sq_repeat$OFFSET, fieldValue);
    }

    private static final AddressLayout sq_item$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("sq_item"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ssizeargfunc sq_item
     * }
     */
    public static final AddressLayout sq_item$layout() {
        return sq_item$LAYOUT;
    }

    private static final long sq_item$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ssizeargfunc sq_item
     * }
     */
    public static final long sq_item$offset() {
        return sq_item$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ssizeargfunc sq_item
     * }
     */
    public static MemorySegment sq_item(MemorySegment struct) {
        return struct.get(sq_item$LAYOUT, sq_item$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ssizeargfunc sq_item
     * }
     */
    public static void sq_item(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sq_item$LAYOUT, sq_item$OFFSET, fieldValue);
    }

    private static final AddressLayout was_sq_slice$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("was_sq_slice"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *was_sq_slice
     * }
     */
    public static final AddressLayout was_sq_slice$layout() {
        return was_sq_slice$LAYOUT;
    }

    private static final long was_sq_slice$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *was_sq_slice
     * }
     */
    public static final long was_sq_slice$offset() {
        return was_sq_slice$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *was_sq_slice
     * }
     */
    public static MemorySegment was_sq_slice(MemorySegment struct) {
        return struct.get(was_sq_slice$LAYOUT, was_sq_slice$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *was_sq_slice
     * }
     */
    public static void was_sq_slice(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(was_sq_slice$LAYOUT, was_sq_slice$OFFSET, fieldValue);
    }

    private static final AddressLayout sq_ass_item$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("sq_ass_item"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ssizeobjargproc sq_ass_item
     * }
     */
    public static final AddressLayout sq_ass_item$layout() {
        return sq_ass_item$LAYOUT;
    }

    private static final long sq_ass_item$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ssizeobjargproc sq_ass_item
     * }
     */
    public static final long sq_ass_item$offset() {
        return sq_ass_item$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ssizeobjargproc sq_ass_item
     * }
     */
    public static MemorySegment sq_ass_item(MemorySegment struct) {
        return struct.get(sq_ass_item$LAYOUT, sq_ass_item$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ssizeobjargproc sq_ass_item
     * }
     */
    public static void sq_ass_item(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sq_ass_item$LAYOUT, sq_ass_item$OFFSET, fieldValue);
    }

    private static final AddressLayout was_sq_ass_slice$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("was_sq_ass_slice"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *was_sq_ass_slice
     * }
     */
    public static final AddressLayout was_sq_ass_slice$layout() {
        return was_sq_ass_slice$LAYOUT;
    }

    private static final long was_sq_ass_slice$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *was_sq_ass_slice
     * }
     */
    public static final long was_sq_ass_slice$offset() {
        return was_sq_ass_slice$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *was_sq_ass_slice
     * }
     */
    public static MemorySegment was_sq_ass_slice(MemorySegment struct) {
        return struct.get(was_sq_ass_slice$LAYOUT, was_sq_ass_slice$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *was_sq_ass_slice
     * }
     */
    public static void was_sq_ass_slice(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(was_sq_ass_slice$LAYOUT, was_sq_ass_slice$OFFSET, fieldValue);
    }

    private static final AddressLayout sq_contains$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("sq_contains"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * objobjproc sq_contains
     * }
     */
    public static final AddressLayout sq_contains$layout() {
        return sq_contains$LAYOUT;
    }

    private static final long sq_contains$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * objobjproc sq_contains
     * }
     */
    public static final long sq_contains$offset() {
        return sq_contains$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * objobjproc sq_contains
     * }
     */
    public static MemorySegment sq_contains(MemorySegment struct) {
        return struct.get(sq_contains$LAYOUT, sq_contains$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * objobjproc sq_contains
     * }
     */
    public static void sq_contains(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sq_contains$LAYOUT, sq_contains$OFFSET, fieldValue);
    }

    private static final AddressLayout sq_inplace_concat$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("sq_inplace_concat"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * binaryfunc sq_inplace_concat
     * }
     */
    public static final AddressLayout sq_inplace_concat$layout() {
        return sq_inplace_concat$LAYOUT;
    }

    private static final long sq_inplace_concat$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * binaryfunc sq_inplace_concat
     * }
     */
    public static final long sq_inplace_concat$offset() {
        return sq_inplace_concat$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * binaryfunc sq_inplace_concat
     * }
     */
    public static MemorySegment sq_inplace_concat(MemorySegment struct) {
        return struct.get(sq_inplace_concat$LAYOUT, sq_inplace_concat$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * binaryfunc sq_inplace_concat
     * }
     */
    public static void sq_inplace_concat(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sq_inplace_concat$LAYOUT, sq_inplace_concat$OFFSET, fieldValue);
    }

    private static final AddressLayout sq_inplace_repeat$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("sq_inplace_repeat"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ssizeargfunc sq_inplace_repeat
     * }
     */
    public static final AddressLayout sq_inplace_repeat$layout() {
        return sq_inplace_repeat$LAYOUT;
    }

    private static final long sq_inplace_repeat$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ssizeargfunc sq_inplace_repeat
     * }
     */
    public static final long sq_inplace_repeat$offset() {
        return sq_inplace_repeat$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ssizeargfunc sq_inplace_repeat
     * }
     */
    public static MemorySegment sq_inplace_repeat(MemorySegment struct) {
        return struct.get(sq_inplace_repeat$LAYOUT, sq_inplace_repeat$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ssizeargfunc sq_inplace_repeat
     * }
     */
    public static void sq_inplace_repeat(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sq_inplace_repeat$LAYOUT, sq_inplace_repeat$OFFSET, fieldValue);
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

