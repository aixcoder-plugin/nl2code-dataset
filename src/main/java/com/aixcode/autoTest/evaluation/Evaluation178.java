package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation178 extends AbstractBaseEvaluation {
    public Evaluation178(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Map<String[], Integer> mTest = new HashMap<>();
        mTest.put(new String[]{"1.0.1","1.0.2"}, -1);
        mTest.put(new String[]{"1.0.1","1.0.1"}, 0);
        mTest.put(new String[]{"1.0.1","1.0.0"}, 1);
        mTest.put(new String[]{"1.2_b10","1.2_b11"}, -1);
        mTest.put(new String[]{"2.0.1","1.0.2"}, 1);
        mTest.put(new String[]{"1.1.1","1.0.2"}, 1);


        int pass_count = 0;
        int total_count = 0;

        for (Map.Entry<String[], Integer> arrBB : mTest.entrySet()) {
            String[] source = arrBB.getKey();
            Integer result = arrBB.getValue();
            int actualReturn;
            try {
                total_count++;
                actualReturn = solution.versionCompare(source[0], source[1]);
                if (actualReturn == result) {
                    pass_count++;
                }
            } catch (Exception e) {
//                e.printStackTrace();
            }
        }

        return new int[]{pass_count, total_count};
    }
}
