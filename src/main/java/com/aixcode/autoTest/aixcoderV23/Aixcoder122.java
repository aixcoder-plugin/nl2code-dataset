package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder122 extends GenerateMethodBase {
        public boolean isNonNegative ( long [ ] [ ] in ) { 
for ( int i = 0 ; i < in . length ; i ++ ) { 
for ( int j = 0 ; j < in [ i ] . length ; j ++ ) { 
if ( in [ i ] [ j ] < 0 ) { 
return false ; 
} 
} 
} 
return true ; 
} 
    }
