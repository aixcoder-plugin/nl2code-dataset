package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto62 extends GenerateMethodBase {
    /**
     * Calculates combinatorial number C(n,m).
     * @param n
     * @param m
     * @return
     */
    public int combinatorial(int n, int m) {
        if (n < 0 || m < 0) {
            throw new IllegalArgumentException("Combinatorial values cannot be negative");
        }

        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        for (int i = 1; i <= m; i++) {
            result /= i;
        }

        return result;
    }
}
