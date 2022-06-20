package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderOld127 extends GenerateMethodBase {
    public int[] range(int start, int end) {
        int[] a = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            a[i - start] = i;
        }
        return a;
    }
}
