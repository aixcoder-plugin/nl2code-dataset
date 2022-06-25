package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.io.FileOutputStream;

public class Aixcoder81 extends GenerateMethodBase {
        public void uploadFile ( String pathname , String filename ) { 
try { 
File file = new File ( pathname ) ;
if ( ! file . exists ( ) ) { 
file . mkdirs ( ) ; 
} 
String filepath = file . getAbsolutePath ( ) + File . separator + filename ; 
FileOutputStream fos = new FileOutputStream ( filepath ) ;
fos . write ( "test" . getBytes ( ) ) ; 
fos . close ( ) ; 
} catch ( Exception e ) { 
e . printStackTrace ( ) ; 
} 
} 
    }
