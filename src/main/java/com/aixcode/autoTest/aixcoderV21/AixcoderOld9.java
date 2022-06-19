package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.text.DateFormat;
import java.util.Date;


public class AixcoderOld9 extends GenerateMethodBase {
    public String date2String(final Date date, final DateFormat format)
        { 
if ( format != null ) { 
return format . format ( date ) ; 
} else { 
return null ;
} 
} 
    }
