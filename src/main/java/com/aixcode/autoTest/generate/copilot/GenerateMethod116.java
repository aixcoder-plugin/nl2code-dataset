package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod116 extends GenerateMethodBase {

    /**
     * Change the size of this array. Content between indexes 0 and min(size(), newSize) will be preserved.
     */
    public int[] resize(int[] arr,long newSize) {
        int[] newArr = new int[(int)newSize];
        int min = Math.min(arr.length, (int)newSize);
        for (int i = 0; i < min; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        return arr;
    }

}
