package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder16 extends GenerateMethodBase {
        public int hashCode ( double [ ] vector ) { 
if ( vector == null ) { 
return 0 ; 
} 
int h = 1 ; 
for ( double element : vector ) { 
int x = (int) Double . doubleToRawLongBits ( element ) ;
h = 31 * h + x ; 
} 
return h ; 
} 
    }
