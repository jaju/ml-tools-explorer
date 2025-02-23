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
 * struct rusage_info_v0 {
 *     uint8_t ri_uuid[16];
 *     uint64_t ri_user_time;
 *     uint64_t ri_system_time;
 *     uint64_t ri_pkg_idle_wkups;
 *     uint64_t ri_interrupt_wkups;
 *     uint64_t ri_pageins;
 *     uint64_t ri_wired_size;
 *     uint64_t ri_resident_size;
 *     uint64_t ri_phys_footprint;
 *     uint64_t ri_proc_start_abstime;
 *     uint64_t ri_proc_exit_abstime;
 * }
 * }
 */
public class rusage_info_v0 {

    rusage_info_v0() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(16, Python_h.C_CHAR).withName("ri_uuid"),
        Python_h.C_LONG_LONG.withName("ri_user_time"),
        Python_h.C_LONG_LONG.withName("ri_system_time"),
        Python_h.C_LONG_LONG.withName("ri_pkg_idle_wkups"),
        Python_h.C_LONG_LONG.withName("ri_interrupt_wkups"),
        Python_h.C_LONG_LONG.withName("ri_pageins"),
        Python_h.C_LONG_LONG.withName("ri_wired_size"),
        Python_h.C_LONG_LONG.withName("ri_resident_size"),
        Python_h.C_LONG_LONG.withName("ri_phys_footprint"),
        Python_h.C_LONG_LONG.withName("ri_proc_start_abstime"),
        Python_h.C_LONG_LONG.withName("ri_proc_exit_abstime")
    ).withName("rusage_info_v0");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout ri_uuid$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("ri_uuid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t ri_uuid[16]
     * }
     */
    public static final SequenceLayout ri_uuid$layout() {
        return ri_uuid$LAYOUT;
    }

    private static final long ri_uuid$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t ri_uuid[16]
     * }
     */
    public static final long ri_uuid$offset() {
        return ri_uuid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t ri_uuid[16]
     * }
     */
    public static MemorySegment ri_uuid(MemorySegment struct) {
        return struct.asSlice(ri_uuid$OFFSET, ri_uuid$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t ri_uuid[16]
     * }
     */
    public static void ri_uuid(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ri_uuid$OFFSET, ri_uuid$LAYOUT.byteSize());
    }

    private static long[] ri_uuid$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint8_t ri_uuid[16]
     * }
     */
    public static long[] ri_uuid$dimensions() {
        return ri_uuid$DIMS;
    }
    private static final VarHandle ri_uuid$ELEM_HANDLE = ri_uuid$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint8_t ri_uuid[16]
     * }
     */
    public static byte ri_uuid(MemorySegment struct, long index0) {
        return (byte)ri_uuid$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint8_t ri_uuid[16]
     * }
     */
    public static void ri_uuid(MemorySegment struct, long index0, byte fieldValue) {
        ri_uuid$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfLong ri_user_time$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ri_user_time"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t ri_user_time
     * }
     */
    public static final OfLong ri_user_time$layout() {
        return ri_user_time$LAYOUT;
    }

    private static final long ri_user_time$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t ri_user_time
     * }
     */
    public static final long ri_user_time$offset() {
        return ri_user_time$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t ri_user_time
     * }
     */
    public static long ri_user_time(MemorySegment struct) {
        return struct.get(ri_user_time$LAYOUT, ri_user_time$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t ri_user_time
     * }
     */
    public static void ri_user_time(MemorySegment struct, long fieldValue) {
        struct.set(ri_user_time$LAYOUT, ri_user_time$OFFSET, fieldValue);
    }

    private static final OfLong ri_system_time$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ri_system_time"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t ri_system_time
     * }
     */
    public static final OfLong ri_system_time$layout() {
        return ri_system_time$LAYOUT;
    }

    private static final long ri_system_time$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t ri_system_time
     * }
     */
    public static final long ri_system_time$offset() {
        return ri_system_time$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t ri_system_time
     * }
     */
    public static long ri_system_time(MemorySegment struct) {
        return struct.get(ri_system_time$LAYOUT, ri_system_time$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t ri_system_time
     * }
     */
    public static void ri_system_time(MemorySegment struct, long fieldValue) {
        struct.set(ri_system_time$LAYOUT, ri_system_time$OFFSET, fieldValue);
    }

    private static final OfLong ri_pkg_idle_wkups$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ri_pkg_idle_wkups"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t ri_pkg_idle_wkups
     * }
     */
    public static final OfLong ri_pkg_idle_wkups$layout() {
        return ri_pkg_idle_wkups$LAYOUT;
    }

    private static final long ri_pkg_idle_wkups$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t ri_pkg_idle_wkups
     * }
     */
    public static final long ri_pkg_idle_wkups$offset() {
        return ri_pkg_idle_wkups$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t ri_pkg_idle_wkups
     * }
     */
    public static long ri_pkg_idle_wkups(MemorySegment struct) {
        return struct.get(ri_pkg_idle_wkups$LAYOUT, ri_pkg_idle_wkups$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t ri_pkg_idle_wkups
     * }
     */
    public static void ri_pkg_idle_wkups(MemorySegment struct, long fieldValue) {
        struct.set(ri_pkg_idle_wkups$LAYOUT, ri_pkg_idle_wkups$OFFSET, fieldValue);
    }

    private static final OfLong ri_interrupt_wkups$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ri_interrupt_wkups"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t ri_interrupt_wkups
     * }
     */
    public static final OfLong ri_interrupt_wkups$layout() {
        return ri_interrupt_wkups$LAYOUT;
    }

    private static final long ri_interrupt_wkups$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t ri_interrupt_wkups
     * }
     */
    public static final long ri_interrupt_wkups$offset() {
        return ri_interrupt_wkups$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t ri_interrupt_wkups
     * }
     */
    public static long ri_interrupt_wkups(MemorySegment struct) {
        return struct.get(ri_interrupt_wkups$LAYOUT, ri_interrupt_wkups$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t ri_interrupt_wkups
     * }
     */
    public static void ri_interrupt_wkups(MemorySegment struct, long fieldValue) {
        struct.set(ri_interrupt_wkups$LAYOUT, ri_interrupt_wkups$OFFSET, fieldValue);
    }

    private static final OfLong ri_pageins$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ri_pageins"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t ri_pageins
     * }
     */
    public static final OfLong ri_pageins$layout() {
        return ri_pageins$LAYOUT;
    }

    private static final long ri_pageins$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t ri_pageins
     * }
     */
    public static final long ri_pageins$offset() {
        return ri_pageins$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t ri_pageins
     * }
     */
    public static long ri_pageins(MemorySegment struct) {
        return struct.get(ri_pageins$LAYOUT, ri_pageins$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t ri_pageins
     * }
     */
    public static void ri_pageins(MemorySegment struct, long fieldValue) {
        struct.set(ri_pageins$LAYOUT, ri_pageins$OFFSET, fieldValue);
    }

    private static final OfLong ri_wired_size$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ri_wired_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t ri_wired_size
     * }
     */
    public static final OfLong ri_wired_size$layout() {
        return ri_wired_size$LAYOUT;
    }

    private static final long ri_wired_size$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t ri_wired_size
     * }
     */
    public static final long ri_wired_size$offset() {
        return ri_wired_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t ri_wired_size
     * }
     */
    public static long ri_wired_size(MemorySegment struct) {
        return struct.get(ri_wired_size$LAYOUT, ri_wired_size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t ri_wired_size
     * }
     */
    public static void ri_wired_size(MemorySegment struct, long fieldValue) {
        struct.set(ri_wired_size$LAYOUT, ri_wired_size$OFFSET, fieldValue);
    }

    private static final OfLong ri_resident_size$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ri_resident_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t ri_resident_size
     * }
     */
    public static final OfLong ri_resident_size$layout() {
        return ri_resident_size$LAYOUT;
    }

    private static final long ri_resident_size$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t ri_resident_size
     * }
     */
    public static final long ri_resident_size$offset() {
        return ri_resident_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t ri_resident_size
     * }
     */
    public static long ri_resident_size(MemorySegment struct) {
        return struct.get(ri_resident_size$LAYOUT, ri_resident_size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t ri_resident_size
     * }
     */
    public static void ri_resident_size(MemorySegment struct, long fieldValue) {
        struct.set(ri_resident_size$LAYOUT, ri_resident_size$OFFSET, fieldValue);
    }

    private static final OfLong ri_phys_footprint$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ri_phys_footprint"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t ri_phys_footprint
     * }
     */
    public static final OfLong ri_phys_footprint$layout() {
        return ri_phys_footprint$LAYOUT;
    }

    private static final long ri_phys_footprint$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t ri_phys_footprint
     * }
     */
    public static final long ri_phys_footprint$offset() {
        return ri_phys_footprint$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t ri_phys_footprint
     * }
     */
    public static long ri_phys_footprint(MemorySegment struct) {
        return struct.get(ri_phys_footprint$LAYOUT, ri_phys_footprint$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t ri_phys_footprint
     * }
     */
    public static void ri_phys_footprint(MemorySegment struct, long fieldValue) {
        struct.set(ri_phys_footprint$LAYOUT, ri_phys_footprint$OFFSET, fieldValue);
    }

    private static final OfLong ri_proc_start_abstime$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ri_proc_start_abstime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t ri_proc_start_abstime
     * }
     */
    public static final OfLong ri_proc_start_abstime$layout() {
        return ri_proc_start_abstime$LAYOUT;
    }

    private static final long ri_proc_start_abstime$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t ri_proc_start_abstime
     * }
     */
    public static final long ri_proc_start_abstime$offset() {
        return ri_proc_start_abstime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t ri_proc_start_abstime
     * }
     */
    public static long ri_proc_start_abstime(MemorySegment struct) {
        return struct.get(ri_proc_start_abstime$LAYOUT, ri_proc_start_abstime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t ri_proc_start_abstime
     * }
     */
    public static void ri_proc_start_abstime(MemorySegment struct, long fieldValue) {
        struct.set(ri_proc_start_abstime$LAYOUT, ri_proc_start_abstime$OFFSET, fieldValue);
    }

    private static final OfLong ri_proc_exit_abstime$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ri_proc_exit_abstime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t ri_proc_exit_abstime
     * }
     */
    public static final OfLong ri_proc_exit_abstime$layout() {
        return ri_proc_exit_abstime$LAYOUT;
    }

    private static final long ri_proc_exit_abstime$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t ri_proc_exit_abstime
     * }
     */
    public static final long ri_proc_exit_abstime$offset() {
        return ri_proc_exit_abstime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t ri_proc_exit_abstime
     * }
     */
    public static long ri_proc_exit_abstime(MemorySegment struct) {
        return struct.get(ri_proc_exit_abstime$LAYOUT, ri_proc_exit_abstime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t ri_proc_exit_abstime
     * }
     */
    public static void ri_proc_exit_abstime(MemorySegment struct, long fieldValue) {
        struct.set(ri_proc_exit_abstime$LAYOUT, ri_proc_exit_abstime$OFFSET, fieldValue);
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

