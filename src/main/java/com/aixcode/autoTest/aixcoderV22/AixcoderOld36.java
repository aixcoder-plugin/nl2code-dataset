package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld36 extends GenerateMethodBase {
    public String extractFileName(String path)
        { 
int lastSlashIndex = path . lastIndexOf ( '/' ) ; 
if ( lastSlashIndex == -1 ) { 
lastSlashIndex = path . lastIndexOf ( '\\' ) ; 
} 
return ( lastSlashIndex != -1 ? path . substring ( lastSlashIndex + 1 ) : path ) ; 
} 
    }
