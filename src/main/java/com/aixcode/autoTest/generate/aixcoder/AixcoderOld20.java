package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld20 extends GenerateMethodBase {
    public Object get(Object[] array, int index)
        { 
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
