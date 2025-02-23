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
 *     getbufferproc bf_getbuffer;
 *     releasebufferproc bf_releasebuffer;
 * }
 * }
 */
public class PyBufferProcs {

    PyBufferProcs() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Python_h.C_POINTER.withName("bf_getbuffer"),
        Python_h.C_POINTER.withName("bf_releasebuffer")
    ).withName("$anon$136:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout bf_getbuffer$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("bf_getbuffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * getbufferproc bf_getbuffer
     * }
     */
    public static final AddressLayout bf_getbuffer$layout() {
        return bf_getbuffer$LAYOUT;
    }

    private static final long bf_getbuffer$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * getbufferproc bf_getbuffer
     * }
     */
    public static final long bf_getbuffer$offset() {
        return bf_getbuffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * getbufferproc bf_getbuffer
     * }
     */
    public static MemorySegment bf_getbuffer(MemorySegment struct) {
        return struct.get(bf_getbuffer$LAYOUT, bf_getbuffer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * getbufferproc bf_getbuffer
     * }
     */
    public static void bf_getbuffer(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(bf_getbuffer$LAYOUT, bf_getbuffer$OFFSET, fieldValue);
    }

    private static final AddressLayout bf_releasebuffer$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("bf_releasebuffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * releasebufferproc bf_releasebuffer
     * }
     */
    public static final AddressLayout bf_releasebuffer$layout() {
        return bf_releasebuffer$LAYOUT;
    }

    private static final long bf_releasebuffer$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * releasebufferproc bf_releasebuffer
     * }
     */
    public static final long bf_releasebuffer$offset() {
        return bf_releasebuffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * releasebufferproc bf_releasebuffer
     * }
     */
    public static MemorySegment bf_releasebuffer(MemorySegment struct) {
        return struct.get(bf_releasebuffer$LAYOUT, bf_releasebuffer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * releasebufferproc bf_releasebuffer
     * }
     */
    public static void bf_releasebuffer(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(bf_releasebuffer$LAYOUT, bf_releasebuffer$OFFSET, fieldValue);
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

