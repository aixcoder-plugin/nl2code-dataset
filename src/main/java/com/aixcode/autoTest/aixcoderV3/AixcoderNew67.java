package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew67 extends GenerateMethodBase {
    public double[] multiplyTranspose(double[] vector, double[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        double[] res = new double[n];
        for (int i = 0; i < m; i++) {
            res[i] = 0d;
            for (int j = 0; j < n; j++) {
                res[i] += matrix[j][i] * vector[j];
            }
        }
        return res;
    }
}
