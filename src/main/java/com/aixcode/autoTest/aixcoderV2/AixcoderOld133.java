package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld133 extends GenerateMethodBase {
        public long currentMonthStartUnixTime ( ) { 
Calendar cal = Calendar . getInstance ( ) ; 
cal . set ( Calendar . DAY_OF_MONTH , 1 ) ; 
cal . set ( Calendar . HOUR_OF_DAY , 0 ) ; 
cal . set ( Calendar . MINUTE , 0 ) ; 
cal . set ( Calendar . SECOND , 0 ) ; 
cal . set ( Calendar . MILLISECOND , 0 ) ; 
return cal . getTimeInMillis ( ) ; 
} 
    }
