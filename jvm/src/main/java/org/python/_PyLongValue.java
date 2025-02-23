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
 * struct _PyLongValue {
 *     uintptr_t lv_tag;
 *     digit ob_digit[1];
 * }
 * }
 */
public class _PyLongValue {

    _PyLongValue() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Python_h.C_LONG.withName("lv_tag"),
        MemoryLayout.sequenceLayout(1, Python_h.C_INT).withName("ob_digit"),
        MemoryLayout.paddingLayout(4)
    ).withName("_PyLongValue");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong lv_tag$LAYOUT = (OfLong)$LAYOUT.select(groupElement("lv_tag"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uintptr_t lv_tag
     * }
     */
    public static final OfLong lv_tag$layout() {
        return lv_tag$LAYOUT;
    }

    private static final long lv_tag$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uintptr_t lv_tag
     * }
     */
    public static final long lv_tag$offset() {
        return lv_tag$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uintptr_t lv_tag
     * }
     */
    public static long lv_tag(MemorySegment struct) {
        return struct.get(lv_tag$LAYOUT, lv_tag$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uintptr_t lv_tag
     * }
     */
    public static void lv_tag(MemorySegment struct, long fieldValue) {
        struct.set(lv_tag$LAYOUT, lv_tag$OFFSET, fieldValue);
    }

    private static final SequenceLayout ob_digit$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("ob_digit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * digit ob_digit[1]
     * }
     */
    public static final SequenceLayout ob_digit$layout() {
        return ob_digit$LAYOUT;
    }

    private static final long ob_digit$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * digit ob_digit[1]
     * }
     */
    public static final long ob_digit$offset() {
        return ob_digit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * digit ob_digit[1]
     * }
     */
    public static MemorySegment ob_digit(MemorySegment struct) {
        return struct.asSlice(ob_digit$OFFSET, ob_digit$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * digit ob_digit[1]
     * }
     */
    public static void ob_digit(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ob_digit$OFFSET, ob_digit$LAYOUT.byteSize());
    }

    private static long[] ob_digit$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * digit ob_digit[1]
     * }
     */
    public static long[] ob_digit$dimensions() {
        return ob_digit$DIMS;
    }
    private static final VarHandle ob_digit$ELEM_HANDLE = ob_digit$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * digit ob_digit[1]
     * }
     */
    public static int ob_digit(MemorySegment struct, long index0) {
        return (int)ob_digit$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * digit ob_digit[1]
     * }
     */
    public static void ob_digit(MemorySegment struct, long index0, int fieldValue) {
        ob_digit$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

