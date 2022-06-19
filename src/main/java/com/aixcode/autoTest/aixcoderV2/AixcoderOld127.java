package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld127 extends GenerateMethodBase {
    public int[] range(int start, int end) {
        int[] result = new int[end - start + 1];
        int index = 0;
        for (int i = start; i <= end; i++) {
            result[index] = i;
            index++;
        }
        return result;
    }
}
