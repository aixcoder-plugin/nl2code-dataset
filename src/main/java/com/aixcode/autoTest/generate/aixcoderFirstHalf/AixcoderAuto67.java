package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;


public class AixcoderAuto67 extends GenerateMethodBase {
    /**
     * Multiplies the vector by the transpose of the given matrix.
     */
    public double[] multiplyTranspose(double[] vector, double[][] matrix) {
        double[] result = new double[vector.length];

        for (int i = 0; i < vector.length; i++) {
            result[i] = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                result[i] += vector[i] * matrix[i][j];
            }
        }

        return result;
    }
}
