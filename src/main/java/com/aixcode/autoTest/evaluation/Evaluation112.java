package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.ArrayList;
import java.util.List;

public class Evaluation112 extends AbstractBaseEvaluation {

    public Evaluation112(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    List<double[]> points1=new ArrayList<>(){{
        add(new double[]{1,2,4,21});
        add(new double[]{2,3});
        add(new double[]{3});
        add(new double[]{4,5,-1,-1});
    }};
    List<double[]> points2=new ArrayList<>(){{
        add(new double[]{3,-10,2,533});
        add(new double[]{2,3});
        add(new double[]{-100});
        add(new double[]{0,0,0,0});
    }};

    @Override
    public int[] evaluation() {
        int pass_count = 0;


        for (int i=0;i<points1.size();i++){
            try {
                double[] point1=points1.get(i);
                double[] point2=points2.get(i);
                double methodRes=solution.length(point1,point2);
                double rightRes=length(point1,point2);
                if (Math.abs(methodRes-rightRes)<0.00001){
                    pass_count++;
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,points1.size()};
    }

    private double length(double[] a, double[] b){
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += Math.pow(a[i] - b[i], 2);
        }
        return Math.sqrt(sum);
    }
}
