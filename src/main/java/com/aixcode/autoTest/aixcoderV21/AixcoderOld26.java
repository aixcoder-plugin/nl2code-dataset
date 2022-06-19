package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AixcoderOld26 extends GenerateMethodBase {
    public java.io.InputStream getInputStream(String filepath)
        { 
java . io . InputStream is = null ; 
try { 
is = new FileInputStream( filepath ) ;
} catch ( FileNotFoundException e ) {
e . printStackTrace ( ) ; 
} 
return is ; 
} 
    }
