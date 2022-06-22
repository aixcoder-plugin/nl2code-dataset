package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.math.BigDecimal;

public class AixcoderOld130 extends GenerateMethodBase {
    public boolean isDecimalWithinIntRange(BigDecimal decimalValue)
        { 
if ( decimalValue == null ) { 
return false ; 
} 
return decimalValue . compareTo ( new BigDecimal ( Integer . MIN_VALUE ) ) >= 0 && decimalValue . compareTo ( new BigDecimal ( Integer . MAX_VALUE ) ) <= 0 ; 
} 
    }
