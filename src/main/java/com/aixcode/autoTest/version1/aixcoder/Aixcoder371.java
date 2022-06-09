package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder371 {
    public static void matrixMultiply(double[][] A, double[][] B) {
        if (A[0].length != B.length) {
            throw new RuntimeException("Illegal matrix dimensions.");
        }

        if (A.length != B[0].length) {
            throw new RuntimeException("Illegal matrix dimensions.");
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] *= B[i][j];
            }
        }
    }
}
