package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld134 extends GenerateMethodBase {
    public Long multiply(Long number, Double multiplier)
        { 
if ( number == 0 || multiplier == 0 ) { 
return 0L ; 
} 
double bigNumber = Double . max ( Math . abs ( number ) , Math . abs ( multiplier ) ) ; 
double smallNumber = Double . min ( Math . abs ( number ) , Math . abs ( multiplier ) ) ; 
double maxMultiplier = Long . MAX_VALUE / bigNumber ; 
if ( smallNumber < maxMultiplier ) { 
return Long . valueOf ( (long) (number.doubleValue() * multiplier) ) . longValue ( ) ;
} else { 
if ( ( number > 0 && multiplier < 0 ) || ( number < 0 && multiplier > 0 ) ) { 
return Long . MIN_VALUE ; 
} else { 
return Long . MAX_VALUE ; 
} 
} 
} 
    }
