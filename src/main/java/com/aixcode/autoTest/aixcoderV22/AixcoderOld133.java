package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Calendar;

public class AixcoderOld133 extends GenerateMethodBase {
    public long currentMonthStartUnixTime()
        { 
Calendar cal = Calendar . getInstance ( ) ;
cal . set ( Calendar . DAY_OF_MONTH , 1 ) ; 
return cal . getTimeInMillis ( ) / 1000 ; 
} 
    }
