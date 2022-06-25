package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aixcoder129 extends GenerateMethodBase {
        public String getNowDate ( int minute ) { 
SimpleDateFormat sdf = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss" ) ;
Date date = new Date( ) ;
date . setTime ( date . getTime ( ) + minute * 60 * 1000 ) ; 
return sdf . format ( date ) ; 
} 
    }
