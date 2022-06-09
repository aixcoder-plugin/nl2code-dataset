package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Evaluation183 extends AbstractBaseEvaluation {
    public Evaluation183(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {

        Map<BigDecimal[], BigDecimal> inputExpect = new HashMap<>();
        inputExpect.put(new BigDecimal[]{new BigDecimal("0"), new BigDecimal("0")}, new BigDecimal("0"));
        inputExpect.put(new BigDecimal[]{new BigDecimal("0.1"), new BigDecimal("1.1")}, new BigDecimal("1.2"));
        inputExpect.put(new BigDecimal[]{new BigDecimal("199999999.99"), new BigDecimal("0.01")}, new BigDecimal("200000000.00"));
        inputExpect.put(new BigDecimal[]{null, new BigDecimal("1")}, new BigDecimal("1"));
        inputExpect.put(new BigDecimal[]{new BigDecimal("1"), null}, new BigDecimal("1"));

        int pass_count = 0;
        int total_count = 0;

        for (Map.Entry<BigDecimal[], BigDecimal> arrBB : inputExpect.entrySet()) {

            BigDecimal[] keyStr = arrBB.getKey();
            BigDecimal result = arrBB.getValue();
            BigDecimal actualReturn;
            try {
                total_count++;
                actualReturn = solution.add(keyStr[0], keyStr[1]);
                if (actualReturn.equals(result)) {
                    pass_count++;
                }else {
                    System.out.println("Fail: " + keyStr + " expect: " + result + " actual: " + actualReturn);
                }
            } catch (Exception e) {
            }
        }

        return new int[]{pass_count, total_count};
    }
}
