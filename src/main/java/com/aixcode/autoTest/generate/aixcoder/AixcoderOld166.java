package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.lang.reflect.Field;

public class AixcoderOld166 extends GenerateMethodBase {
    public <T> T initByReflect(String name, String value, T t)
        { 
Class < ? > clazz = t . getClass ( ) ; 
try { 
Field field = clazz . getDeclaredField ( name ) ;
field . setAccessible ( true ) ; 
field . set ( t , value ) ; 
} catch ( Exception e ) { 
e . printStackTrace ( ) ; 
} 
return t ; 
} 
    }
