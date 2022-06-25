package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder72 extends GenerateMethodBase {
        public < T > T newInstance ( Class < T > clazz ) { 
try { 
return clazz . newInstance ( ) ; 
} catch ( InstantiationException | IllegalAccessException e ) { 
throw new RuntimeException ( e ) ; 
} 
} 
    }
