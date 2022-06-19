package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.io.FileInputStream;

public class AixcoderOld81 extends GenerateMethodBase {
    public void uploadFile(String pathname, String filename)
        { 
try { 
File file = new File ( pathname ) ;
if ( ! file . exists ( ) ) { 
file . mkdirs ( ) ; 
} 
String filepath = file . getAbsolutePath ( ) + File . separator + filename ; 
File file1 = new File ( filepath ) ; 
FileInputStream fis = new FileInputStream ( file1 ) ;
byte [ ] buf = new byte [ 1024 ] ; 
int len ; 
while ( ( len = fis . read ( buf ) ) > 0 ) { 
fis . read ( buf ) ; 
} 
fis . close ( ) ; 
} catch ( Exception e ) { 
e . printStackTrace ( ) ; 
} 
} 
    }
