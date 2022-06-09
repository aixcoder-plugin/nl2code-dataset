package com.aixcode.autoTest.version1.copilot;

public class Copilot397 {
    /**
     * Calculates combinatorial number C(n,m).
     */
    public static int combinatorial(int n, int m) {
        if (n < 0 || m < 0 || m > n) {
            return 0;
        }
        if (m == 0 || m == n) {
            return 1;
        }
        return combinatorial(n - 1, m - 1) + combinatorial(n - 1, m);
    }

}
