package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder2;
import com.aixcode.autoTest.version1.copilot.Copilot2;

import java.util.*;

public class Check2  extends BaseAbstractTest {
    List<double[][]> list= new ArrayList<>(){
        {
            add(new double[][]{
                    {9.0,5.0,3.0},
                    {46.0,23.0,36.0}
            });
            add(new double[][]{
                    {11.0,0.0,0.0,0.0},
                    {0.0,12.0,0.0,0.0},
                    {0.0,0.0,10.0,0.0},
                    {0.0,0.0,0.0,3.0}
            });
            add(new double[][]{
                    {14.0,25.0},
                    {421.0,533.0},
                    {75.0,932.0},
                    {7.0,32.12}
            });
        }
    };
    List<double[]> list2=new ArrayList<>(){
        {
            add(new double[]{1.0,7.0,23.0});
            add(new double[]{54.0,51.0,36.0,90.0});
            add(new double[]{7.0,9.0});
        }
    };

    @Override
    public int[] checkCopilot() {
        Copilot2 solution=new Copilot2();
        int passCount=0;
        for (int i=0;i<list.size();i++){
            double[][] value=list.get(i);
            double[] value2=list2.get(i);
            try {
                if (Arrays.equals(solution.multiplyTranspose(value2,value),multiplyTranspose(value2,value))){
                    passCount++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,list.size()};
    }

    public static double[] multiplyTranspose(double[] vector, double[][] matrix) {
        double[] result = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                result[i] += vector[j] * matrix[i][j];
            }
        }
        return result;
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder2 solution=new Aixcoder2();
        int passCount=0;
        for (int i=0;i<list.size();i++){
            double[][] value=list.get(i);
            double[] value2=list2.get(i);
            try {
                if (Arrays.equals(solution.multiplyTranspose(value2,value),multiplyTranspose(value2,value))){
                    passCount++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,list.size()};
    }

    private double[] getInput1(String s) {
        String[] tmp = s.split(",");
        double[] result = new double[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            double d = Double.parseDouble(tmp[i]);
            result[i] = d;
        }
        return result;
    }

    private double[][] getInput2(String s) {
        String[] tmp = s.split(" ");
        double[][] result = new double[tmp.length][];
        for (int i = 0; i < tmp.length; i++) {
            double[] d = getInput1(tmp[i]);
            result[i] = d;
        }
        return result;
    }

    private Map<List<String>, String> init() {
        // TODO: 测试输入输出要重新设计
        Map<List<String>, String> map = new HashMap<>();
        List<String> input = new ArrayList<>();
        input.add("1.0,2.0,3.0");
        input.add("1.0,2.0,3.0 1,2,3 1,2,3");
        map.put(input, "6.0,12.0,18.0");
        List<String> input1 = new ArrayList<>();
        input1.add("1.0,2.0");
        input1.add("10.0,20.0 3.0,4.0");
        map.put(input1, "30.0,14.0");

        return map;
    }
}
