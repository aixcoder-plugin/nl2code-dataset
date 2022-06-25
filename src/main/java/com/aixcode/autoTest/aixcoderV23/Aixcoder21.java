package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.HashMap;
import java.util.Map;

public class Aixcoder21 extends GenerateMethodBase {
        public void putAdditionalProperty ( String key , Object value , Map< String , Object > additionalProperties ) {
if ( additionalProperties == null ) { 
additionalProperties = new HashMap< String , Object >( ) ;
} 
additionalProperties . put ( key , value ) ; 
} 
    }
