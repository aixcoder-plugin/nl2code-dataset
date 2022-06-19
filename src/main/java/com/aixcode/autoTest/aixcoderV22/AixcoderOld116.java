package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderOld116 extends GenerateMethodBase {
    public int[] resize(int[] arr, long newSize) {
        int[] newArr = new int[(int) newSize];

        if (arr != null) {
            System.arraycopy(arr, 0, newArr, 0, Math.min(arr.length, (int) newSize));
        }

        return newArr;
    }
}
