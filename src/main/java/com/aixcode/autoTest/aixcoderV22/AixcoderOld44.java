package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Map;
import java.util.Set;

public class AixcoderOld44 extends GenerateMethodBase {
    public void removeNullValue(Map<String, Object> map)
        { 
Set< String > keySet = map . keySet ( ) ;
for ( String key : keySet ) { 
Object obj = map . get ( key ) ; 
if ( obj == null || "" . equals ( obj . toString ( ) . trim ( ) ) ) { 
map . remove ( key ) ; 
} 
} 
} 
    }
