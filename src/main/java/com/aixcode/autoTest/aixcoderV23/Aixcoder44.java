package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Map;
import java.util.Set;

public class Aixcoder44 extends GenerateMethodBase {
        public void removeNullValue ( Map< String , Object > map ) {
Set< String > keySet = map . keySet ( ) ;
for ( String key : keySet ) { 
Object obj = map . get ( key ) ; 
if ( obj == null || "" . equals ( obj . toString ( ) ) ) { 
map . remove ( key ) ; 
} 
} 
} 
    }
