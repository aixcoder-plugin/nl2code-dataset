package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew62 extends GenerateMethodBase {
    public int combinatorial(int n, int m) {
        int i, j, k, l;
        l = m = n;
        while (l-- != 0) m += m;
        j = n--;
        k = m--;
        while (m-- != 0) {
//            for (i = n; i > k; i--) {
//                System.out.print(i + " ");
//            }
//            System.out.print(j + " ");
//            for (i = m + 1; i <= k; i++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
        }
        return (n + m);
    }
}
