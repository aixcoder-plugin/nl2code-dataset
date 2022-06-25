package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Calendar;


public class Aixcoder125 extends GenerateMethodBase {
        public int getDaysByMonth ( String dateTime ) { 
Calendar cal = Calendar . getInstance ( ) ;
//cal . setTime ( parse ( dateTime ) ) ;
return cal . getActualMaximum ( Calendar . DAY_OF_MONTH ) ; 
} 
    }
