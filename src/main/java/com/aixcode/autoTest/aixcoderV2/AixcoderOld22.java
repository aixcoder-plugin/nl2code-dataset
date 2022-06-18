package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld22 extends GenerateMethodBase {
        public String readImageData ( String filename ) throws IOException { 
FileInputStream fis = new FileInputStream ( filename ) ; 
byte [ ] data = new byte [ fis . available ( ) ] ; 
fis . read ( data ) ; 
fis . close ( ) ; 
return Base64.getEncoder().encodeToString(data) ;
} 
    }
