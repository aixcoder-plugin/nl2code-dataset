package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld44 extends GenerateMethodBase {
        public void removeNullValue ( Map < String , Object > map ) { 
Set < String > keySet = map . keySet ( ) ; 
for ( String key : keySet ) { 
Object obj = map . get ( key ) ; 
if ( obj == null ) { 
map . remove ( key ) ; 
} 
} 
} 
    }
