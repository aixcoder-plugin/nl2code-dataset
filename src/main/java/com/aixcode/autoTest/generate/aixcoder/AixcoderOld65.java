package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AixcoderOld65 extends GenerateMethodBase {
    public Date getMonthLastDay(String dateString)
        { 
SimpleDateFormat simpleDateFormat = new SimpleDateFormat ( "yyyy-MM" ) ;
Date date = null ; 
try { 
date = simpleDateFormat . parse ( dateString ) ; 
} catch ( Exception e ) { 
e . printStackTrace ( ) ; 
} 
Calendar calendar = Calendar . getInstance ( ) ;
if ( date != null ) { 
calendar . setTime ( date ) ; 
} 
calendar . add ( Calendar . MONTH , 1 ) ; 
calendar . add ( Calendar . DAY_OF_MONTH , -1 ) ; 
return calendar . getTime ( ) ; 
} 
    }
