package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder32 {
    /**
     * Returns the minimum value in an array.
     */
    public static int min(int[] array) {
        //Validates input
        if (array == null) {
            throw new IllegalArgumentException("The Array must not be null");
        } else if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }

        //Finds and returns min
        int min = array[0];

        for (int j = 1; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }

        return min;
    }

}
