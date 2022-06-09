package com.aixcode.autoTest.version1.copilot;

public class Copilot304 {
    /**
     * Compute the product of this matrix and the given column vector.
     */
    public double[] product(double[] columnVector,double[][] matrix) {
        double[] result=new double[matrix.length];
        for (int i=0;i<matrix.length;i++){
            double[] row=matrix[i];
            double sum=0;
            for (int j=0;j<row.length;j++){
                sum+=row[j]*columnVector[j];
            }
            result[i]=sum;
        }
        return result;
    }
}
