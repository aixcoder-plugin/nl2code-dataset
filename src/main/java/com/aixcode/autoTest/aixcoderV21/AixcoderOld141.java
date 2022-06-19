package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AixcoderOld141 extends GenerateMethodBase {
    public long getDistanceDays(String str1, String str2)
        { 
SimpleDateFormat df = new SimpleDateFormat ( "yyyy-MM-dd" ) ;
long day = 0 ; 
try { 
Date start = df . parse ( str1 ) ;
Date end = df . parse ( str2 ) ; 
long time1 = start . getTime ( ) ; 
long time2 = end . getTime ( ) ; 
long diff ; 
if ( time1 < time2 ) { 
diff = time2 - time1 ; 
} else { 
diff = time1 - time2 ; 
} 
day = diff / ( 24 * 60 * 60 * 1000 ) ; 
} catch ( ParseException e ) {
e . printStackTrace ( ) ; 
} 
return day ; 
} 
    }
