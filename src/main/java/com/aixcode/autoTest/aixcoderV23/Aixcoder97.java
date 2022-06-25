package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Arrays;

public class Aixcoder97 extends GenerateMethodBase {
        public < T > T [ ] concat ( T [ ] a , T [ ] b ) { 
T [ ] c = Arrays. copyOf ( a , a . length + b . length ) ;
System . arraycopy ( b , 0 , c , a . length , b . length ) ; 
return c ; 
} 
    }
