package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Calendar;

public class AixcoderOld133 extends GenerateMethodBase {
    public long currentMonthStartUnixTime()
        { 
Calendar cal = Calendar . getInstance ( ) ;
cal . set ( Calendar . DAY_OF_MONTH , 1 ) ; 
cal . set ( Calendar . HOUR_OF_DAY , 0 ) ; 
cal . set ( Calendar . MINUTE , 0 ) ; 
cal . set ( Calendar . SECOND , 0 ) ; 
cal . set ( Calendar . MILLISECOND , 0 ) ; 
return cal . getTimeInMillis ( ) ; 
} 
    }
