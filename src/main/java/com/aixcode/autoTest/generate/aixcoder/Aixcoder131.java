package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder131 extends GenerateMethodBase {
    /**
     *   Produces a new double array containing the elements between the start and end indices. The start index is inclusive, the end index exclusive. Null array input produces null output.
     */
    @Override
    public double[] subarray(final double[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return null;
        }

        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        }

        if (endIndexExclusive > array.length) {
            endIndexExclusive = array.length;
        }

        final int newSize = endIndexExclusive - startIndexInclusive;

        if (newSize <= 0) {
            return new double[0];
        }

        final double[] subarray = new double[newSize];
        System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        return subarray;
    }
}
