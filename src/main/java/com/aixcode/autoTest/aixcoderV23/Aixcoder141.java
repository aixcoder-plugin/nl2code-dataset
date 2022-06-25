package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aixcoder141 extends GenerateMethodBase {
        public long getDistanceDays ( String str1 , String str2 ) { 
DateFormat df = new SimpleDateFormat( "yyyy-MM-dd" ) ;
Date one ;
Date two ; 
long days = 0 ; 
try { 
one = df . parse ( str1 ) ; 
two = df . parse ( str2 ) ; 
long time1 = one . getTime ( ) ; 
long time2 = two . getTime ( ) ; 
long diff ; 
if ( time1 < time2 ) { 
diff = time2 - time1 ; 
} else { 
diff = time1 - time2 ; 
} 
days = diff / ( 24 * 60 * 60 * 1000 ) ; 
} catch ( ParseException e ) {
e . printStackTrace ( ) ; 
} 
return days ; 
} 
    }
