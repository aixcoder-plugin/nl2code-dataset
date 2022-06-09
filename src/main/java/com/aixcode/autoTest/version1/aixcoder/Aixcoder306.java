package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder306 {
    /**
     * Rearranges the elements of the specified subarray in random order.
     */
    public static void shuffle(int[] array) {
        if (array == null)
            throw new NullPointerException("argument array is null");

        int n = array.length;

        for (int i = 0; i < n; i++) {
            //between i and n-1
            int r = i + (int) (Math.random() * (n-i));
            int temp = array[i];
            array[i] = array[r];
            array[r] = temp;
        }
    }
}
