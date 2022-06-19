package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.io.IOException;

public class AixcoderOld39 extends GenerateMethodBase {
    public String generateTempFile(String dir)
        { 
String fileName = "temp" ;
File file = new File ( dir , fileName ) ;
if ( ! file . exists ( ) ) { 
try { 
file . createNewFile ( ) ; 
} catch ( IOException e ) {
throw new RuntimeException ( "Cannot create temporary file " + fileName , e ) ; 
} 
} 
return file . getAbsolutePath ( ) ; 
} 
    }
