package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder103 extends GenerateMethodBase {
        public boolean equals ( double a , double b , double epsilon ) { 
if ( a == b ) 
return true ; 
else if ( Math . abs ( a - b ) < epsilon ) 
return true ; 
else 
return false ; 
} 
    }
