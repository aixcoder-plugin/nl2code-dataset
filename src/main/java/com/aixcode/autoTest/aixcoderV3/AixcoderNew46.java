package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew46 extends GenerateMethodBase {
    public void matrixMultiply(double[][] A, double[][] B) {
        if (A.length != B.length || A[0].length != B[0].length)
            throw new RuntimeException("Illegal matrix dimensions.");
        int rows = A.length;
        int cols = A[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = 0;
                for (int k = 0; k < cols; k++) A[i][j] += A[i][k] * B[k][j];
            }
        }
    }
}
