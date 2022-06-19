package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.HashMap;
import java.util.Map;

public class AixcoderOld21 extends GenerateMethodBase {
    public void putAdditionalProperty(String key, Object value, Map<String, Object> additionalProperties)
        { 
if ( value instanceof Boolean ) { 
value = ( Boolean ) value ? "true" : "false" ; 
} 
if ( additionalProperties == null ) { 
additionalProperties = new HashMap< String , Object >( ) ;
} 
additionalProperties . put ( key , value ) ; 
} 
    }
