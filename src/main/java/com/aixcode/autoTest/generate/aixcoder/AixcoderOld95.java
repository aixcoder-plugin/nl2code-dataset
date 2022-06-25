package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld95 extends GenerateMethodBase {
    public boolean equals(Object o1, Object o2)
        { 
if ( o1 == o2 ) { 
return true ; 
} 
if ( o1 == null || o2 == null ) { 
return false ; 
} 
if ( o1 instanceof Number && o2 instanceof Number ) { 
return ( ( Number ) o1 ) . doubleValue ( ) == ( ( Number ) o2 ) . doubleValue ( ) ; 
} 
return o1 . equals ( o2 ) ; 
} 
    }
