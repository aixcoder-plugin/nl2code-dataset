package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderOld62 extends GenerateMethodBase {
    public int combinatorial(int n, int m) {
        int result = 1;
        int i = n;
        int j = m;
        while (i > 0 || j > 0) {
            if (i > 0) {
                result *= i;
                i--;
            }
            if (j > 0) {
                result *= j;
                j--;
            }
        }
        return result;
    }
}
