package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Calendar;
import java.util.Date;

public class AixcoderOld45 extends GenerateMethodBase {
    public int getYear(Date date)
        { 
Calendar calendar = Calendar . getInstance ( ) ;
calendar . setTime ( date ) ; 
return calendar . get ( Calendar . YEAR ) ; 
} 
    }
