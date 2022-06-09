package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Evaluation143 extends AbstractBaseEvaluation {
    public Evaluation143(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Pattern[] testPatterns = new Pattern[]{Pattern.compile("^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$"), Pattern.compile("^([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)*@([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)+[\\.][A-Za-z]{2,3}([\\.][A-Za-z]{2})?$")};
        Map<String, Boolean> mTest = new HashMap<>();
        mTest.put("06/06/2022", true);
        mTest.put("mtest@163.com",true);
        mTest.put("2022-22-22", false);
        mTest.put("mtestInvalid%163*com", false);
        mTest.put("", false);

        int pass_count = 0;
        int total_count = 0;

        for (Map.Entry<String, Boolean> arrBB : mTest.entrySet()) {
            String expected = arrBB.getKey();
            Boolean bb = arrBB.getValue();
            boolean actualReturn;
            try {
                total_count++;
                actualReturn = solution.matchesPattern(expected, testPatterns);
                if (actualReturn == bb){
                    pass_count++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        try {
            total_count++;
            boolean distanceDays = solution.matchesPattern(null, testPatterns);
            if(!distanceDays){
                pass_count++;
            }
        } catch (Exception e) {

        }

        try {
            total_count++;
            boolean distanceDays = solution.matchesPattern("2022-06-06", null);
            if(!distanceDays){
                pass_count++;
            }
        } catch (Exception e) {

        }

        return new int[]{pass_count, total_count};
    }
}
