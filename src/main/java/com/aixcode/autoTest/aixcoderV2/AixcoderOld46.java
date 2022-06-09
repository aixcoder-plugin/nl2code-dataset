package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderOld46 extends GenerateMethodBase {
    public void matrixMultiply(double[][] A, double[][] B)
            throws Exception {
//        checkMatrixDimensions(A, B);
        int m= A.length;
        int n= A[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = A[i][j] * B[i][j];
            }
        }
    }
}
