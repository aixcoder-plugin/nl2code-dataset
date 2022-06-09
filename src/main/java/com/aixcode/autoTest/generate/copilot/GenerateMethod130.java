package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.math.BigDecimal;

public class GenerateMethod130 extends GenerateMethodBase {
    /**
     *   Check the given value is in int range.
     */
    public boolean isDecimalWithinIntRange(BigDecimal decimalValue)
    {
        return decimalValue.compareTo(new BigDecimal(Integer.MAX_VALUE)) <= 0 && decimalValue.compareTo(new BigDecimal(Integer.MIN_VALUE)) >= 0;
    }
}
