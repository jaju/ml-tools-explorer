package org.msync.machine_learning.tools;

import jdk.incubator.vector.IntVector;
import jdk.incubator.vector.VectorSpecies;

import java.util.Random;
import java.util.stream.IntStream;

class VectorAPI {

    static final VectorSpecies<Integer> SPECIES = IntVector.SPECIES_PREFERRED;

    public static int[] addScalarArrays(int[] a, int[] b) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] + b[i];
        }
        return result;
    }

    public static IntVector addVectorArrays(IntVector a, IntVector b) {
        return a.add(b);
    }

    public static void main(String args[]) {
        var arrayLen = 10_000;
        int loop_count = 100_000;
        int[] a = IntStream.generate(() -> new Random().nextInt(100)).limit(arrayLen).toArray();
        int[] b = IntStream.generate(() -> new Random().nextInt(100)).limit(arrayLen).toArray();

        var start_time = System.nanoTime();
        for (int count = 0; count < loop_count; count++) {
            addScalarArrays(a, b);
        }
//        System.out.println(STR."Scalar result: \{java.util.Arrays.toString(result)}");
        var end_time = System.nanoTime();
        System.out.println(STR."Time taken for scalar addition: \{end_time - start_time}");

        IntVector va = IntVector.fromArray(SPECIES, a, 0);
        IntVector vb = IntVector.fromArray(SPECIES, b, 0);
        start_time = System.nanoTime();
        for (int count = 0; count < loop_count; count++) {
            IntVector vr = addVectorArrays(va, vb);
            int[] result2 = new int[4];
            vr.intoArray(result2, 0);
        }
        end_time = System.nanoTime();
//        System.out.println(STR."Vector result: \{java.util.Arrays.toString(result2)}");
        System.out.println(STR."Time taken for vector addition: \{end_time - start_time}");
    }

}
