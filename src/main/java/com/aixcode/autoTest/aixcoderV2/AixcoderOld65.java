package com.aixcode.autoTest.aixcoderV2;

import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld65 extends GenerateMethodBase {
        public Date getMonthLastDay ( String dateString ) { 
SimpleDateFormat simpleDateFormat = new SimpleDateFormat ( "yyyy-MM" ) ;
Date date = null ; 
try { 
date = simpleDateFormat . parse ( dateString ) ; 
} catch ( Exception e ) { 
e . printStackTrace ( ) ; 
} 
Calendar calendar = Calendar . getInstance ( ) ; 
if ( date != null ) { 
calendar . setTime ( date ) ; 
} 
calendar . add ( Calendar . MONTH , 1 ) ; 
calendar . add ( Calendar . DAY_OF_MONTH , -1 ) ; 
return calendar . getTime ( ) ; 
} 
    }
