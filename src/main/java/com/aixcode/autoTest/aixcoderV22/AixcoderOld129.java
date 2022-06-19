package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AixcoderOld129 extends GenerateMethodBase {
    public String getNowDate(int minute)
        { 
SimpleDateFormat sdf = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss" ) ;
Calendar calendar = Calendar . getInstance ( ) ;
calendar . add ( Calendar . MINUTE , minute ) ; 
return sdf . format ( calendar . getTime ( ) ) ; 
} 
    }
