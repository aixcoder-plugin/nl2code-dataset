package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld36 extends GenerateMethodBase {
    public String extractFileName(String path)
        { 
int lastSlashIndex = path . lastIndexOf ( '/' ) ; 
int lastDotIndex = path . lastIndexOf ( '.' ) ; 
if ( lastDotIndex > lastSlashIndex ) { 
lastSlashIndex = lastDotIndex ; 
} 
return path . substring ( lastSlashIndex + 1 ) ; 
} 
    }
