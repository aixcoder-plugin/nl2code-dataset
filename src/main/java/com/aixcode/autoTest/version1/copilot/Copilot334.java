package com.aixcode.autoTest.version1.copilot;

public class Copilot334 {
    /**
     * Find the occurence of the given key in the given array. Linear search, worst case running time is O(n).
     */
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
