package org.msync.machine_learning.tools;

import jdk.incubator.vector.IntVector;
import jdk.incubator.vector.VectorSpecies;

class VectorAPI {

  static final VectorSpecies<Integer> SPECIES = IntVector.SPECIES_PREFERRED;

  public int[] addScalarArrays(int[] a, int[] b) {
    int[] result = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      result[i] = a[i] + b[i];
    }
    return result;
  }

  public IntVector addVectorArrays(IntVector a, IntVector b) {
    return a.add(b);
  }

  public static void main(String args[]) {
    VectorAPI api = new VectorAPI();
    int[] a = {1, 2, 3, 4};
    int[] b = {5, 6, 7, 8};
    int[] result = api.addScalarArrays(a, b);
    System.out.println(STR."Scalar result: \{java.util.Arrays.toString(result)}");

    IntVector va = IntVector.fromArray(SPECIES, a, 0);
    IntVector vb = IntVector.fromArray(SPECIES, b, 0);
    IntVector vr = api.addVectorArrays(va, vb);
    int[] result2 = new int[4];
    vr.intoArray(result2, 0);
    System.out.println(STR."Vector result: \{java.util.Arrays.toString(result2)}");
  }

}
