package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AixcoderOld129 extends GenerateMethodBase {
    public String getNowDate(int minute)
        { 
Calendar cal = Calendar . getInstance ( ) ;
cal . add ( Calendar . MINUTE , minute ) ; 
return new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" ) . format ( cal . getTime ( ) ) ;
} 
    }
