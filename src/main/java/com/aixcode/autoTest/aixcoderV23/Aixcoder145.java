package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder145 extends GenerateMethodBase {
        public boolean equals ( Object [ ] array , Object [ ] other ) { 
int length = array . length ; 
if ( length != other . length ) { 
return false ; 
} 
for ( int i = 0 ; i < length ; i ++ ) { 
if ( ! ( array [ i ] . equals ( other [ i ] ) ) ) { 
return false ; 
} 
} 
return true ; 
} 
    }
