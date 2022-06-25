package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder138 extends GenerateMethodBase {
        public String toBinary ( byte [ ] pBytes ) { 
StringBuilder result = new StringBuilder ( ) ; 
for ( byte b : pBytes ) { 
for ( int j = 7 ; j >= 0 ; j -- ) { 
result . append ( ( ( b & 1 ) == 0 ) ? '0' : '1' ) ; 
b >>= 1 ; 
} 
} 
return result . toString ( ) ; 
} 
    }
