package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.*;

public class Evaluation106 extends AbstractBaseEvaluation {

    public Evaluation106(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int passCount = 0;
//        int[] a = {1,2,3,4,5,6,7,8};
//        int a1= 2;
//        int[] b = {1,2,3,4,5,6,7,8};
//        int b1= 3;
//        int[] c = {1,2,3,4,5,6,7,8};
//        int c1= 4;
//        int[] d = {1,2,3,4,5,6,7,8};
//        int d1= 5;
//        int[] e = {1,2,3,4,5,6,7,8};
//        int e1= 6;
//        Map<int[],Integer> map = new HashMap<int[],Integer>(){{
//            put(a,a1);
//            put(b,b1);
//            put(c, c1);
//            put(d, d1);
//            put(e, e1);
//        }};
        int[][] array = new int[][]{
                {1,2},{1,23,4,6,28,31,1,2},{200},{},{1,2,3,4,5,6,7,8,9}
        };
        int[] weidths=new int[]{2,2,1,1,3};
        int[] heights=new int[]{1,4,1,1,3};
        List<int[][]> list=new ArrayList<>(){
            {
                add(new int[][]{
                        {1,2}
                });
                add(new int[][]{
                        {1,23},{4,6},{28,31},{1,2}
                });
                add(new int[][]{
                        {200}
                });
                add(new int[0][0]);
                add(new int[][]{
                        {1,2,3},{4,5,6},{7,8,9}
                });
            }
        };
        for (int i = 0; i < array.length; i++) {
            try {
                int[][] modelRes = solution.arrayToMatrix(array[i], weidths[i], heights[i]);
                int[][] target = list.get(i);
                if (array[i] == null || array[i].length == 0) {
                    if (modelRes == null || modelRes.length == 0) {
                        passCount++;
                    }
                } else {
                    if (arrayEquals(modelRes, target)) {
                        passCount++;
                    }
                }

            } catch (Exception e) {
            }
        }
        return new int[]{passCount,array.length};
    }

    public static boolean arrayEquals(int[][] array1,int[][] array2){

        if (array1==array2)
            return true;
        if (array1==null || array2==null)
            return false;

        if (array1.length != array2.length)
            return false;

        if (array1[0].length != array2[0].length)
            return false;

        for (int i = 0; i < array1.length; i++) {
            if (!Arrays.equals(array1[i], array2[i]))
                return false;
        }

        return true;
    }


}
