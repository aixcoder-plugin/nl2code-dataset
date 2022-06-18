package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation180 extends AbstractBaseEvaluation {
    public Evaluation180(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {

        Map<String, Boolean> inputExpect = new HashMap<>();
        inputExpect.put("10010100", true);
        inputExpect.put("10010100100101001001010010010100", true);
        inputExpect.put("100101001001", false);
        inputExpect.put("", false);
        inputExpect.put("12345678", false);
        inputExpect.put("ABCDEFGH", false);
        inputExpect.put("        ", false);

        int pass_count = 0;
        int total_count = 0;

        for (Map.Entry<String, Boolean> arrBB : inputExpect.entrySet()) {

            String keyStr = arrBB.getKey();
            Boolean result = arrBB.getValue();
            Boolean actualReturn;
            try {
                total_count++;
                actualReturn = solution.isBin(keyStr);
                if (actualReturn == result) {
                    pass_count++;
                }
            } catch (Exception e) {
            }
        }

        try {
            total_count++;
            boolean actualReturn = solution.isBin(null);
            if (!actualReturn) {
                pass_count++;
            }
        } catch (Exception e) {
        }

        return new int[]{pass_count, total_count};
    }
}
