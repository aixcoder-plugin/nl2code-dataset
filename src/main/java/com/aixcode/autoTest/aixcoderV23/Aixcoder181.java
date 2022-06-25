package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Aixcoder181 extends GenerateMethodBase {
        public List< Class > getClassGenricType (Class clazz ) {
Type genType = clazz . getGenericSuperclass ( ) ;
if ( ! ( genType instanceof ParameterizedType) ) {
//logger . warn ( clazz . getSimpleName ( ) + "'s superclass not ParameterizedType" ) ;
return null ; 
} 
Type [ ] params = ( ( ParameterizedType ) genType ) . getActualTypeArguments ( ) ; 
if ( params == null || params . length == 0 ) { 
//logger . warn ( clazz . getSimpleName ( ) + " not have generic parameter" ) ;
return null ; 
} 
List < Class > list = new ArrayList< Class >( ) ;
for ( Type type : params ) { 
if ( type instanceof Class ) { 
list . add ( ( Class ) type ) ; 
} 
} 
return list ; 
} 
    }
