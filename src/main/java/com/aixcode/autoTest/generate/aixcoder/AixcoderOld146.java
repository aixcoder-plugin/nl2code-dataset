package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class AixcoderOld146 extends GenerateMethodBase {
    public Set<String> getMethods(ClassLoader classLoader, String className)
        throws ClassNotFoundException { 
Set < String > methods = new HashSet< >( ) ;
Class < ? > clazz = classLoader . loadClass ( className ) ; 
for ( Method method : clazz . getDeclaredMethods ( ) ) {
methods . add ( method . getName ( ) ) ; 
} 
return methods ; 
} 
    }
