package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder36 extends GenerateMethodBase {
        public String extractFileName ( String path ) { 
int lastSlashIndex = path . lastIndexOf ( '/' ) ; 
if ( lastSlashIndex == -1 ) { 
lastSlashIndex = path . lastIndexOf ( '\\' ) ; 
} 
return ( lastSlashIndex != -1 ? path . substring ( lastSlashIndex + 1 ) : path ) ; 
} 
    }
