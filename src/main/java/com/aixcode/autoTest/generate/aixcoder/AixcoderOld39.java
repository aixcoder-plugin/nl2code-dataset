package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.io.IOException;

public class AixcoderOld39 extends GenerateMethodBase {
    public String generateTempFile(String dir)
        { 
try { 
File tempFile = File . createTempFile ( "tempFileGenerator" , ".tmp" ) ;
tempFile . deleteOnExit ( ) ; 
return tempFile . getAbsolutePath ( ) ; 
} catch ( IOException e ) {
throw new RuntimeException ( e ) ; 
} 
} 
    }
