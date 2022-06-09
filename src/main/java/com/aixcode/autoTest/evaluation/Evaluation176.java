package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation176 extends AbstractBaseEvaluation {
    public Evaluation176(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Map<int[],Boolean> mTest = new HashMap<>();
        mTest.put(new int[]{127,6}, true);
        mTest.put(new int[]{65535,15}, true);
        mTest.put(new int[]{1,2}, false);
        mTest.put(new int[]{0,2}, false);
        mTest.put(new int[]{0,-2}, false);
        mTest.put(new int[]{0,82}, false);
        int pass_count = 0;
        int total_count = 0;

        for (Map.Entry<int[],Boolean> arrBB : mTest.entrySet()) {
            int[] source = arrBB.getKey();
            boolean result = arrBB.getValue();
            boolean actualReturn;
            try {
                total_count++;
                actualReturn = solution.getBinaryState(source[0], source[1]);
                if (actualReturn == result) {
                    pass_count++;
                }
            } catch (Exception e) {
            }
        }

        return new int[]{pass_count, total_count};
    }
}
