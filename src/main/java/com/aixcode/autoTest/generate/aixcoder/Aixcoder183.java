package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.math.BigDecimal;

public class Aixcoder183 extends GenerateMethodBase {
    /**
     *  Returns whether or no the JDK version is 1.7u40 and above.
     */
    @Override
    public BigDecimal add(BigDecimal aVal, BigDecimal bVal) {
        if (aVal == null) {
            aVal = BigDecimal.ZERO;
        }

        if (bVal == null) {
            bVal = BigDecimal.ZERO;
        }

        return aVal.add(bVal);
    }
}
