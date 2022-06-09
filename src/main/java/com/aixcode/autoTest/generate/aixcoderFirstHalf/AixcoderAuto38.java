package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto38 extends GenerateMethodBase {
    /**
     * Find the occurence of the given key in the given array. Linear search, worst case running time is O(n).
     */
    public int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }

        return -1;
    }
}
