package com.aixcode.autoTest.aixcoderV2;

import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld64 extends GenerateMethodBase {
        public String getStringToday ( String format ) { 
Date currentTime = new Date ( ) ; 
SimpleDateFormat formatter = new SimpleDateFormat( format ) ;
String dateString = formatter . format ( currentTime ) ; 
return dateString ; 
} 
    }
