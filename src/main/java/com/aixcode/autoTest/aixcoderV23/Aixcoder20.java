package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder20 extends GenerateMethodBase {
        public Object get ( Object [ ] array , int index ) { 
if ( array == null ) { 
return null ; 
} 
if ( index < 0 ) { 
return null ; 
} 
if ( index >= array . length ) { 
return null ; 
} 
return array [ index ] ; 
} 
    }
