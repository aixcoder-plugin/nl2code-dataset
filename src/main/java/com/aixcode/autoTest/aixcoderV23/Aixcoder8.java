package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder8 extends GenerateMethodBase {
        public int findMaxNumber ( int [ ] nums ) { 
if ( nums == null || nums . length == 0 ) { 
return 0 ; 
} 
int maxNumber = nums [ 0 ] ; 
for ( int i = 1 ; i < nums . length ; i ++ ) { 
if ( nums [ i ] > maxNumber ) { 
maxNumber = nums [ i ] ; 
} 
} 
return maxNumber ; 
} 
    }
