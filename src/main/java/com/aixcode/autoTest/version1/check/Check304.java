package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder304;
import com.aixcode.autoTest.version1.copilot.Copilot304;

public class Check304 extends BaseAbstractTest {
    public double[][] vector={{1,2,3},{4,5,6}};
    public double[][][] matrix={{{1,2,3},{4,5,6}},{{13,21,31},{42,53,62}}};

    @Override
    public int[] checkCopilot() {
        Copilot304 solution=new Copilot304();
        int passCount=0;
        for (int i=0;i<vector.length;i++){
            double[] value=vector[i];
            try {
                double[] res=solution.product(value,matrix[i]);
                if (isEqual(res,canonicalSolution(value,matrix[i]))){
                    passCount++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,vector.length};
    }

    public double[] canonicalSolution(double[] columnVector,double[][] matrix) {
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

    public boolean isEqual(double[] a,double[] b){
        if (a.length!=b.length){
            return false;
        }
        for (int i=0;i<a.length;i++){
            if (a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder304 solution=new Aixcoder304();
        int passCount=0;
        for (int i=0;i<vector.length;i++){
            double[] value=vector[i];
            try {
                double[] res=solution.product(value,matrix[i]);
                if (isEqual(res,canonicalSolution(value,matrix[i]))){
                    passCount++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,vector.length};
    }
}
