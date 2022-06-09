package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder383 {
    /**
     * Convert a primitive input array into its object array version (e.g. from int[] to Integer[]).
     */
    public static Integer[] toObjectArray(int[] array) {
        Integer[] result = new Integer[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }

        return result;
    }
}
