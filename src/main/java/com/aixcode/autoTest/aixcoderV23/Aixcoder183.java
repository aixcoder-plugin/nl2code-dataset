package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.math.BigDecimal;

public class Aixcoder183 extends GenerateMethodBase {
        public BigDecimal add (BigDecimal aVal , BigDecimal bVal ) {
if ( aVal == null ) { 
aVal = BigDecimal . ZERO ; 
} 
if ( bVal == null ) { 
bVal = BigDecimal . ZERO ; 
} 
return aVal . add ( bVal ) ; 
} 
    }
