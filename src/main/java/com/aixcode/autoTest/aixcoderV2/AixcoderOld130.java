package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

import java.math.BigDecimal;

public class AixcoderOld130 extends GenerateMethodBase {
    public boolean isDecimalWithinIntRange(BigDecimal decimalValue) {
        if (decimalValue == null) {
            return false;
        }

        return decimalValue.compareTo(new BigDecimal(Integer.MIN_VALUE)) < 0 && decimalValue.compareTo(new BigDecimal(Integer.MAX_VALUE)) > 0;
    }
//        public boolean isDecimalWithinIntRange ( BigDecimal decimalValue )
//if ( decimalValue == null ) {
//return false ;
//}
//( intMin != null && decimalValue . compareTo ( intMin ) < 0 ) {
//return false ;
//}
//if ( intMax != null && decimalValue . compareTo ( intMax ) > 0 ) {
//return false ;
//}
//return true ;
//}
}
