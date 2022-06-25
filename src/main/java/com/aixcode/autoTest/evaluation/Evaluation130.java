package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Evaluation130 extends AbstractBaseEvaluation {
    public Evaluation130(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Map<BigDecimal,Boolean> arrTestInput = new HashMap<>();
        arrTestInput.put(new BigDecimal("-12738"), true); // negative values of int
        arrTestInput.put(new BigDecimal("0.565656"),true); // decimal values in Integer range
        arrTestInput.put(new BigDecimal("23948"),true); // positive value of int
        arrTestInput.put(new BigDecimal("-2147483649"),false);// less than  minimum of Integer
        arrTestInput.put(new BigDecimal("2147483649"),false);// bigger than maximum of Integer

        int pass_count = 0;
        int total_count = arrTestInput.size();
        for (Map.Entry<BigDecimal, Boolean> testData : arrTestInput.entrySet()) {
            try {
                if( testData.getValue() == solution.isDecimalWithinIntRange(testData.getKey()) ){
                    pass_count++;
                }
            } catch (Exception e) {
            }
        }

        total_count++;
        try {
            if (!solution.isDecimalWithinIntRange(null)) {
                pass_count++;
            }
        }catch (Exception e) {
        }
        return new int[]{pass_count,total_count};
    }
}
