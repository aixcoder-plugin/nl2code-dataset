package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation141 extends AbstractBaseEvaluation {
    public Evaluation141(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Map<Integer, String[]> mTest = new HashMap<>();
        mTest.put(0, new String[]{"2022-06-06", "2022-06-06"});
        mTest.put(1, new String[]{"2022-06-06", "2022-06-07"});
        mTest.put(-1, new String[]{"2022-06-07", "2022-06-06"});
        mTest.put(30, new String[]{"2022-06-06", "2022-07-06"});
        mTest.put(365, new String[]{"2021-06-06", "2022-06-06"});

        int pass_count = 0;
        int total_count = 0;

        for (Map.Entry<Integer, String[]> arrBB : mTest.entrySet()) {
            Integer expected = arrBB.getKey();
            String[] bb = arrBB.getValue();
            long actualReturn;
            try {
                total_count++;
                actualReturn = solution.getDistanceDays(bb[0], bb[1]);
                if (actualReturn == Math.abs(expected)){
                    pass_count++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        try {
            total_count++;
            long distanceDays = solution.getDistanceDays(null, "2022-06-06");
            if(distanceDays == -1){
                pass_count++;
            }
        } catch (Exception e) {

        }

        try {
            total_count++;
            long distanceDays = solution.getDistanceDays("2022-06-06", null);
            if(distanceDays == -1){
                pass_count++;
            }
        } catch (Exception e) {

        }

        try {
            total_count++;
            long distanceDays = solution.getDistanceDays(null, null);
            if(distanceDays == -1){
                pass_count++;
            }
        } catch (Exception e) {

        }

        return new int[]{pass_count, total_count};
    }
}
