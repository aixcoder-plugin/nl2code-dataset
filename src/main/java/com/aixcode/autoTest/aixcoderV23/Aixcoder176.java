package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder176 extends GenerateMethodBase {
        public boolean getBinaryState ( int targetInteger , int position ) { 
if ( position < 1 || position > 32 ) { 
throw new IllegalArgumentException ( "Position out of bound. Should be between 1 and 32." ) ; 
} 
int value = 1 << ( position -1 ) ; 
return ( targetInteger & value ) == value ; 
} 
    }
