package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import java.math.BigDecimal;

public class AixcoderOld183 extends GenerateMethodBase {
    public BigDecimal add(BigDecimal aVal, BigDecimal bVal)
        { 
if ( aVal == null ) { 
aVal = BigDecimal . ZERO ; 
} 
if ( bVal == null ) { 
bVal = BigDecimal . ZERO ; 
} 
return aVal . add ( bVal ) ; 
} 
    }
