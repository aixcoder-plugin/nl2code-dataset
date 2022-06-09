package com.aixcode.autoTest.version1.aixcoder;


public class Aixcoder2 {
    /**
     * Multiplies the vector by the transpose of the given matrix.
     */
    public static double[] multiplyTranspose(double[] vector, double[][] matrix) {
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
