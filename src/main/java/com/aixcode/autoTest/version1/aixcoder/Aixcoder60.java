package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder60 {
    public int[] copy(int[] arr) {
        if (arr == null) {
            return null;
        }

        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        return copy;
    }
}
