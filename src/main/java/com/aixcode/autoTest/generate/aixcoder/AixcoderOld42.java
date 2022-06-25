package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AixcoderOld42 extends GenerateMethodBase {
    public String getLastYearDate()
        { 
Date date = new Date ( ) ;
// 可以方便地修改日期格式
SimpleDateFormat dateFormat = new SimpleDateFormat ( "yyyy" ) ;
String years = dateFormat . format ( date ) ; 
return years ; 
} 
    }
