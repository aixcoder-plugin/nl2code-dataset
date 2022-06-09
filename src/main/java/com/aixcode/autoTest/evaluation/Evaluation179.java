package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation179 extends AbstractBaseEvaluation {
    public Evaluation179(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Map<String, Long> targetTest = new HashMap<>();
        targetTest.put("10", 10L);
        targetTest.put("11", 11L);
        targetTest.put("12", 12L);
        targetTest.put("13", 13L);
        targetTest.put("14", 14L);
        targetTest.put("15", 15L);
        targetTest.put("16", 16L);

        Map<Long[], Long> inputExpect = new HashMap<>();
        inputExpect.put(new Long[]{10L, -10L}, 0L );
        inputExpect.put(new Long[]{11L, 1L}, 12L );
        inputExpect.put(new Long[]{20L, 10L}, 10L );
        inputExpect.put(new Long[]{15L, 15L}, 30L );
        inputExpect.put(new Long[]{33L, -1L}, -1L );

        int pass_count = 0;
        int total_count = 0;

        for (Map.Entry<Long[], Long> arrBB : inputExpect.entrySet()) {
            Long[] source = arrBB.getKey();
            String keyStr = String.valueOf(source[0]);
            Long result = arrBB.getValue();
            Long actualReturn;
            try {
                total_count++;
                actualReturn = solution.incrBy(targetTest, keyStr, source[1]);
                if (actualReturn == result) {
                    pass_count++;
                }
            } catch (Exception e) {
            }
        }

        try {
            total_count++;
            Long actualReturn = solution.incrBy(null, "12", 12L);
            if (actualReturn == null) {
                pass_count++;
            }
        } catch (Exception e) {
        }

        return new int[]{pass_count, total_count};
    }
}
