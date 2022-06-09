package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder127 extends GenerateMethodBase {
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
