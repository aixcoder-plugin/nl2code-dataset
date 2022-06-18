package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld39 extends GenerateMethodBase {
        public String generateTempFile ( String dir ) { 
String fileName = generateTempFileName ( dir ) ; 
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
