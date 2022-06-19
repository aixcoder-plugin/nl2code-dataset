package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.lang.reflect.Field;

public class AixcoderOld166 extends GenerateMethodBase {
    public <T> T initByReflect(String name, String value, T t)
        { 
try { 
Class < ? > clazz = t . getClass ( ) ; 
Field[ ] fields = clazz . getDeclaredFields ( ) ;
for ( Field field : fields ) { 
if ( field . getName ( ) . equals ( name ) ) { 
field . setAccessible ( true ) ; 
field . set ( t , value ) ; 
} 
} 
} catch ( Exception e ) { 
e . printStackTrace ( ) ; 
} 
return t ; 
} 
    }
