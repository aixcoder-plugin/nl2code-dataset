package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder320 {
    /**
     * Returns the value of an array by index, or null if the array has no value at that index.
     */
    public static Object get(Object[] array, int index) {
        if (array == null) {
            return null;
        }

        if (index < 0) {
            return null;
        }

        if (index >= array.length) {
            return null;
        }

        return array[index];
    }
}
