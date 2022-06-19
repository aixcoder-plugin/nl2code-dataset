package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld72 extends GenerateMethodBase {
    public <T> T newInstance(Class<T> clazz)
        { 
try { 
return clazz . newInstance ( ) ; 
} catch ( InstantiationException e ) { 
throw new RuntimeException ( e ) ; 
} catch ( IllegalAccessException e ) { 
throw new RuntimeException ( e ) ; 
} 
} 
    }
