package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder334 {
    /**
     * Find the occurence of the given key in the given array. Linear search, worst case running time is O(n).
     */
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }

        return -1;
    }
}
