package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld130 extends GenerateMethodBase {
        public boolean isDecimalWithinIntRange ( BigDecimal decimalValue ) 
if ( decimalValue == null ) { 
return false ; 
} 
( intMin != null && decimalValue . compareTo ( intMin ) < 0 ) { 
return false ; 
} 
if ( intMax != null && decimalValue . compareTo ( intMax ) > 0 ) { 
return false ; 
} 
return true ; 
} 
    }
