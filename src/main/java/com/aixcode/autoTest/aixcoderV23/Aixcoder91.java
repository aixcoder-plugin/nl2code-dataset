package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder91 extends GenerateMethodBase {
        public int average ( int a , int b ) { 
int sum = a + b ; 
return ( sum <= 0 ) ? 0 : ( sum >= 255 ) ? 255 : sum / 2 ; 
} 
    }
