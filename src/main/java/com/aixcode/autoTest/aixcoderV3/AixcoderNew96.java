package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew96 extends GenerateMethodBase {
    public double[] product(double[] columnVector, double[][] matrix) {

        int nRows=matrix.length;
        int nCols=matrix[0].length;
        double[] result = new double[nRows];
        for (int r = 0; r < nRows; ++r) {
            double sum = 0.0d;
            for (int c = 0; c < nCols; ++c) sum += matrix[r][c] * columnVector[c];
            result[r] = sum;
        }
        return result;
    }
}
