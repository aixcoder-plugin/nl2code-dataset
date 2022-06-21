package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Calendar;



public class AixcoderOld125 extends GenerateMethodBase {
    public int getDaysByMonth(String dateTime)
        { 
Calendar cal = Calendar . getInstance ( ) ;
//cal . setTime ( parse ( dateTime ) ) ;
return cal . getActualMaximum ( Calendar . DAY_OF_MONTH ) ; 
} 
    }
