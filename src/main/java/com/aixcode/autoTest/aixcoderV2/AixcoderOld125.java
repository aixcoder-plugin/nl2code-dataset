package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld125 extends GenerateMethodBase {
        public int getDaysByMonth ( String dateTime ) { 
Calendar cal = Calendar . getInstance ( ) ; 
cal . setTime ( parse ( dateTime ) ) ; 
return cal . getActualMaximum ( Calendar . DAY_OF_MONTH ) ; 
} 
    }
