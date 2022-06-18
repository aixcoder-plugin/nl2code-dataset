package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld41 extends GenerateMethodBase {
        public Map < String , Object > getAllUpperCase ( Map < String , Object > map ) { 
if ( map == null ) { 
return null ; 
} 
Map < String , Object > mapUpper = new HashMap < > ( ) ; 
for ( Map . Entry < String , Object > entry : map . entrySet ( ) ) { 
mapUpper . put ( toUpperCase ( entry . getKey ( ) ) , entry . getValue ( ) ) ; 
} 
return mapUpper ; 
} 
    }
