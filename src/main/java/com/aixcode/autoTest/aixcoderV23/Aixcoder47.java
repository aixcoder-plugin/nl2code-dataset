package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Aixcoder47 extends GenerateMethodBase {
        public List<Field> getFields (Class < ? > clazz ) {
if ( null == clazz ) { 
return null ; 
} 
List < Field > fields = new ArrayList< Field >( ) ;
for ( Field field : clazz . getFields ( ) ) { 
fields . add ( field ) ; 
} 
return fields ; 
} 
    }
