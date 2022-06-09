package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation145 extends AbstractBaseEvaluation {
    public Evaluation145(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Object[] targetArray = new Object[]{1,2,3,4,5,6,7,8,9,0};
        Map<Object[], Boolean> mTest = new HashMap<>();
        mTest.put(new Object[]{1,2,3,4,5,6,7,8,9,0}, true);
        mTest.put(new Object[]{1,2,3,4,5,6,7,8,9}, false);
        mTest.put(new Object[]{1L,2L,3L,4L,5L,6L,7L,8L,9L,0L}, false);
        mTest.put(new Object[0], false);
        mTest.put(null, false);

        int pass_count = 0;
        int total_count = 0;

        for (Map.Entry<Object[], Boolean> arrBB : mTest.entrySet()) {
            Object[] expected = arrBB.getKey();
            Boolean bb = arrBB.getValue();
            boolean actualReturn;
            try {
                total_count++;
                actualReturn = solution.equals(expected, targetArray);
                if (actualReturn == bb){
                    pass_count++;
                }
            } catch (Exception e) {
            }

        }

        try {
            total_count++;
            boolean distanceDays = solution.equals(targetArray, null);
            if(!distanceDays){
                pass_count++;
            }
        } catch (Exception e) {

        }

        try {
            total_count++;
            boolean distanceDays = solution.equals(null, null);
            if(!distanceDays){
                pass_count++;
            }
        } catch (Exception e) {

        }

        return new int[]{pass_count, total_count};
    }
}
