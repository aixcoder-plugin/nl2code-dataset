package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder89 extends GenerateMethodBase {
        public boolean checkOverflow ( int x , int y ) { 
if ( x < 0 || y < 0 ) { 
return true ; 
} 
if ( x > Integer.MAX_VALUE - y ) {
return true ; 
} 
if ( y > Integer.MAX_VALUE - x ) {
return true ; 
} 
return false ; 
} 
    }
