package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder371;
import com.aixcode.autoTest.version1.copilot.Copilot371;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Check371 extends BaseAbstractTest {
    List<double[][]> list11=new ArrayList<>(){
        {
            add(new double[][]{{1,2,3},{4,5,6}});
            add(new double[][]{{1.3}});
            add(new double[][]{{7,8,9},{10,11,12},{1.302,101,29}});
        }
    };
    List<double[][]> list21=new ArrayList<>(){
        {
            add(new double[][]{{1,2,3},{4,5,6}});
            add(new double[][]{{1.3}});
            add(new double[][]{{7,8,9},{10,11,12},{1.302,101,29}});
        }
    };
    List<double[][]> list12=new ArrayList<>(){
        {
            add(new double[][]{{21,12,37},{1.4,25,4.36}});
            add(new double[][]{{10.2}});
            add(new double[][]{{47,28,19},{120,131,212},{3.22,12,223}});
        }
    };
    List<double[][]> list22=new ArrayList<>(){
        {
            add(new double[][]{{21,12,37},{1.4,25,4.36}});
            add(new double[][]{{10.2}});
            add(new double[][]{{47,28,19},{120,131,212},{3.22,12,223}});
        }
    };
    List<double[][]> list3=new ArrayList<>(){
        {
            add(new double[][]{{21.0, 24.0, 111.0},{5.6, 125.0, 26.160000000000004}});
            add(new double[][]{{13.26}});
            add(new double[][]{{329.0, 224.0, 171.0},{1200.0, 1441.0, 2544.0},{4.19244, 1212.0, 6467.0}});
        }
    };
    @Override
    public int[] checkCopilot() {
        Copilot371 solution=new Copilot371();
        int passCount=0;
        for (int i=0;i<list11.size();i++){
            double[][] value=list11.get(i);
            double[][] value2=list12.get(i);
            double[][] value3=list3.get(i);
            try {
                solution.matrixMultiply(value,value2);
                if (arrayEquals(value,value3)){
                    passCount++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,list11.size()};
    }

    public static boolean arrayEquals(double[][] array1,double[][] array2){

        if (array1==array2)
            return true;
        if (array1==null || array2==null)
            return false;

        if (array1.length != array2.length)
            return false;

        if (array1[0].length != array2[0].length)
            return false;

        for (int i = 0; i < array1.length; i++) {  //二维数组中的每个数组使用equals方法比较
            if (Arrays.equals(array1[i],array2[i])==false)
                return false;  //有一个为false，返回false
        }

        return true;
    }

    public static void matrixMultiply(double[][] A, double[][] B) {
        if (A.length != B.length) {
            throw new RuntimeException("Illegal matrix dimensions.");
        }

        if (A[0].length != B[0].length) {
            throw new RuntimeException("Illegal matrix dimensions.");
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] *= B[i][j];
            }
        }
    }

    public static void main(String[] args) {
        Check371 check371=new Check371();
        for (int i=0;i<check371.list11.size();i++){
            double[][] value=check371.list11.get(i);
            double[][] value2=check371.list12.get(i);
            matrixMultiply(value,value2);
            System.out.println(Arrays.deepToString(value));
        }
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder371 solution=new Aixcoder371();
        int passCount=0;
        for (int i=0;i<list21.size();i++){
            double[][] value=list21.get(i);
            double[][] value2=list22.get(i);
            double[][] value3=list3.get(i);
            try {
                solution.matrixMultiply(value,value2);
                if (arrayEquals(value,value3)){
                    passCount++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,list21.size()};
    }
}
