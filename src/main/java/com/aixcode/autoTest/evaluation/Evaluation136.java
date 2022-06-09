package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.lang.reflect.Field;

public class Evaluation136 extends AbstractBaseEvaluation {
    public Evaluation136(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {

        int pass_count = 0;
        int total_count = 0;
        try {
            total_count++;
            Field f = solution.findField(Double.class, "MIN_VALUE", Double.class);
            if (f != null && f.getName().equals("MIN_VALUE")) {
                pass_count++;
            }
        } catch (Exception e) {

        }

        try {
            total_count++;
            Field f = solution.findField(Double.class, "MAX_VALUE", Double.class);
            if (f != null && f.getName().equals("MAX_VALUE")) {
                pass_count++;
            }
        } catch (Exception e) {

        }

        try {
            total_count++;
            Field f = solution.findField(Double.class, "NOT_EXIST_VALUE", Double.class);
            if(f == null) {
                pass_count++;
            }else
            {
                System.out.println(f.getName());
            }
        } catch (Exception e) {

        }

        try {
            total_count++;
            Field f = solution.findField(String.class, null, String.class);
            if(f == null) {
                pass_count++;
            }
        } catch (Exception e) {
        }

        try {
            total_count++;
            Field f = solution.findField(null, null, null);
            if(f == null) {
                pass_count++;
            }
        } catch (Exception e) {
        }

        return new int[]{pass_count, total_count};
    }
}
