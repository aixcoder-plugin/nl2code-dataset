package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod67 extends GenerateMethodBase {
    /**
     * Multiplies the vector by the transpose of the given matrix.
     */
    public double[] multiplyTranspose(double[] vector, double[][] matrix) {
        double[] result = new double[vector.length];
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                result[i] += vector[j] * matrix[j][i];
            }
        }
        return result;
    }
}
