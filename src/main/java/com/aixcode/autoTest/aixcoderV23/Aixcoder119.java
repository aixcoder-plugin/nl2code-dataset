package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.text.DecimalFormat;

public class Aixcoder119 extends GenerateMethodBase {
        public String formatDouble ( double val ) { 
DecimalFormat df = new DecimalFormat ( "#.00" ) ;
return df . format ( val ) ; 
} 
    }
