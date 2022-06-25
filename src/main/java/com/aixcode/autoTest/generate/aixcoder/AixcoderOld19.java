package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.HashMap;
import java.util.Map;

public class AixcoderOld19 extends GenerateMethodBase {
    public Map<String, String> parseQueryString(String queryString)
        { 
Map < String , String > map = new HashMap< >( ) ;
if ( queryString != null ) { 
String [ ] parameters = queryString . split ( "&" ) ; 
for ( String parameter : parameters ) { 
String [ ] keyValue = parameter . split ( "=" ) ; 
map . put ( keyValue [ 0 ] , keyValue . length == 2 ? keyValue [ 1 ] : null ) ; 
} 
} 
return map ; 
} 
    }
