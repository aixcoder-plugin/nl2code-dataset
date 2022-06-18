package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld181 extends GenerateMethodBase {
        public Class getClassGenricType ( Class clazz ) { 
Type genType = clazz . getGenericSuperclass ( ) ; 
if ( ! ( genType instanceof ParameterizedType ) ) { 
logger . warn ( clazz . getSimpleName ( ) + "'s superclass not ParameterizedType" ) ; 
return Object . class ; 
} 
Type [ ] params = ( ( ParameterizedType ) genType ) . getActualTypeArguments ( ) ; 
if ( params . length != 1 ) { 
logger . warn ( clazz . getSimpleName ( ) + " not only one parameter" ) ; 
return Object . class ; 
} 
if ( ! ( params [ 0 ] instanceof Class ) ) { 
logger . warn ( clazz . getSimpleName ( ) + " not only class" ) ; 
return Object . class ; 
} 
return ( Class ) params [ 0 ] ; 
} 
    }
