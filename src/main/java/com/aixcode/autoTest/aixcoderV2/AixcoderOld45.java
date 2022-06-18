package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld45 extends GenerateMethodBase {
        public int getYear ( Date date ) { 
Calendar calendar = Calendar . getInstance ( ) ; 
calendar . setTime ( date ) ; 
return calendar . get ( Calendar . YEAR ) ; 
} 
    }
