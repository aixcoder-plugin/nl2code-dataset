package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Collection;
import java.util.Map;

public class AixcoderOld87 extends GenerateMethodBase {
    public boolean isInstanceOf(Object object, Class<?> type)
        { 
if ( object == null ) { 
return false ; 
} 
if ( type . isInstance ( object ) ) { 
return true ; 
} 
if ( object instanceof String ) { 
return type . isInstance ( object ) ; 
} 
if ( object instanceof Number ) { 
return type . isInstance ( object ) ; 
} 
if ( object instanceof Boolean ) { 
return type . isInstance ( object ) ; 
} 

if ( object instanceof Map) {
return type . isInstance ( object ) ; 
} 
if ( object instanceof Collection) {
return type . isInstance ( object ) ; 
} 
if ( object . getClass ( ) . isArray ( ) ) { 
return type . isInstance ( object ) ; 
} 
return false ; 
} 
    }
