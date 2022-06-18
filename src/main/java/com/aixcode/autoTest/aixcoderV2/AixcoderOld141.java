package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld141 extends GenerateMethodBase {
        public long getDistanceDays ( String str1 , String str2 ) { 
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
