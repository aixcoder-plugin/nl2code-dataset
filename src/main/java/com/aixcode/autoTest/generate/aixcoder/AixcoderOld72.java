package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld72 extends GenerateMethodBase {
    public <T> T newInstance(Class<T> clazz)
        { 
try { 
return clazz . newInstance ( ) ; 
} catch ( InstantiationException | IllegalAccessException e ) { 
throw new RuntimeException ( e ) ; 
} 
} 
    }
