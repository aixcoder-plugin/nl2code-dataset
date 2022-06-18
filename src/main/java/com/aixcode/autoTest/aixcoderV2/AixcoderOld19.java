package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld19 extends GenerateMethodBase {
        public Map < String , String > parseQueryString ( String queryString ) { 
Map < String , String > map = new HashMap < > ( ) ; 
if ( queryString != null ) { 
String [ ] parameters = queryString . split ( "&" ) ; 
for ( String parameter : parameters ) { 
String [ ] keyValue = parameter . split ( "=" ) ; 
map . put ( keyValue [ 0 ] , keyValue . length > 1 ? keyValue [ 1 ] : null ) ; 
} 
} 
return map ; 
} 
    }
