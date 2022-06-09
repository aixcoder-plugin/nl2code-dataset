package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation138 extends AbstractBaseEvaluation {
    public Evaluation138(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {

        Map<String, byte[]> lsTestData = new HashMap<>();
        lsTestData.put("00000000", new byte[]{0});
        lsTestData.put("00000001000000100000001100000100", new byte[]{1,2,3,4});
        lsTestData.put("01111010011110000111011101111001", new byte[]{'z','x','w','y'});
        lsTestData.put("11111111111111111111111111111111", new byte[]{-1,-1,-1,-1});
        lsTestData.put("0111111110000000", new byte[]{127,-128});
        lsTestData.put("", new byte[0]);
        lsTestData.put(null, null);

        int pass_count = 0;
        int total_count = lsTestData.size();

        for(Map.Entry<String, byte[]> testData : lsTestData.entrySet()) {
            String actualReturn = null;
            try {
                actualReturn = solution.toBinary(testData.getValue());

                if (actualReturn.equals(testData.getKey())) {
                    pass_count++;
                }
            } catch (Exception e) {
            }
        }
        return new int[]{pass_count, total_count};
    }
}
