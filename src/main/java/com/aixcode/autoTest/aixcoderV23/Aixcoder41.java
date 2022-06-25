package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.HashMap;
import java.util.Map;

public class Aixcoder41 extends GenerateMethodBase {
        public Map< String , Object > getAllUpperCase (Map < String , Object > map ) {
if ( map == null ) { 
return null ; 
} 
Map < String , Object > tempMap = new HashMap< >( ) ;
for ( Map . Entry < String , Object > entry : map . entrySet ( ) ) { 
tempMap . put (  ( entry . getKey ( ).toUpperCase() ) , entry . getValue ( ) ) ;
} 
return tempMap ; 
} 
    }
