package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

public class Aixcoder22 extends GenerateMethodBase {
        public String readImageData ( String filename ) throws IOException {
FileInputStream fis = new FileInputStream ( filename ) ;
byte [ ] data = new byte [ fis . available ( ) ] ; 
fis . read ( data ) ; 
fis . close ( ) ; 
return Base64.getEncoder(). encodeToString ( data ) ;
} 
    }
