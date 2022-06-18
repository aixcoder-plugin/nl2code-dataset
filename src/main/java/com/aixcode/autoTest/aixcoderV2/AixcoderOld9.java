package com.aixcode.autoTest.aixcoderV2;

import java.text.DateFormat;
import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;


public class AixcoderOld9 extends GenerateMethodBase {
        public String date2String ( final Date date , final DateFormat format ) {
if ( format != null ) { 
return format . format ( date ) ; 
} else { 
return null ;
} 
} 
    }
