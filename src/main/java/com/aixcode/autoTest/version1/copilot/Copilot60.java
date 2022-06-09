package com.aixcode.autoTest.version1.copilot;

public class Copilot60 {
    /**
     * Create a copy of the Integer array
     */
    public int[] copy(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}
