package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder358;
import com.aixcode.autoTest.version1.copilot.Copilot358;

import java.util.HashMap;
import java.util.Map;

public class Check358 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot358 solution = new Copilot358();
        double[] p1 = {1, 1};
        double[] p2 = {2,2};
        double[] p3 = {3, 3};
        double[] p4 = {4, 4};
        double[] p5 = {5, 5};
        double[] q1 = {4, 5};
        double[] q2 = {5, 6};
        double[] q3 = {6, 7};
        double[] q4 = {7, 8};
        double[] q5 = {8, 9};
        Map<double[],double[]> map = new HashMap<double[], double[]>(){{
            put(p1,q1);
            put(p2, q2);
            put(p3, q3);
            put(p4, q4);
            put(p5, q5);
        }};
        int pass_count = 0;
        for (Map.Entry<double[], double[]> entry : map.entrySet()){
            double result = solution.euclideanDistance(entry.getKey(), entry.getValue());
            if (result == 5){
                pass_count++;
            }
        }
        return new int[]{pass_count, map.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder358 solution = new Aixcoder358();
        double[] p1 = {1, 1};
        double[] p2 = {2,2};
        double[] p3 = {3, 3};
        double[] p4 = {4, 4};
        double[] p5 = {5, 5};
        double[] q1 = {4, 5};
        double[] q2 = {5, 6};
        double[] q3 = {6, 7};
        double[] q4 = {7, 8};
        double[] q5 = {8, 9};
        Map<double[],double[]> map = new HashMap<double[], double[]>(){{
            put(p1,q1);
            put(p2, q2);
            put(p3, q3);
            put(p4, q4);
            put(p5, q5);
        }};
        int pass_count = 0;
        for (Map.Entry<double[], double[]> entry : map.entrySet()){
            double result = solution.euclideanDistance(entry.getKey(), entry.getValue());
            if (result == 5){
                pass_count++;
            }
        }
        return new int[]{pass_count, map.size()};
    }
}
