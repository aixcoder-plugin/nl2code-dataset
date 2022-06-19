package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.HashMap;
import java.util.Map;

public class AixcoderOld41 extends GenerateMethodBase {
    public Map<String, Object> getAllUpperCase(Map<String, Object> map)
        { 
if ( map == null ) { 
return null ; 
} 
Map < String , Object > tempMap = new HashMap< >( ) ;
for ( Map . Entry < String , Object > entry : map . entrySet ( ) ) { 
String key = entry . getKey ( ) . toUpperCase ( ) ; 
tempMap . put ( key , entry . getValue ( ) ) ; 
} 
return tempMap ; 
} 
    }
