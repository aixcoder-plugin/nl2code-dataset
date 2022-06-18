package com.aixcode.autoTest.aixcoderV2;

import java.lang.reflect.Field;
import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld47 extends GenerateMethodBase {
        public List < Field > getFields ( Class < ? > clazz ) { 
if ( null == clazz ) { 
return null ; 
} 
List <Field> fields = new ArrayList < Field > ( ) ;
for ( Field field : clazz . getFields ( ) ) { 
fields . add ( field ) ; 
} 
return fields ; 
} 
    }
