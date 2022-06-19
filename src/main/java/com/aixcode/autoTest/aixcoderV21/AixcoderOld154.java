package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.net.URL;

public class AixcoderOld154 extends GenerateMethodBase {
    public URL getUrlFile(String fileName)
        { 
if ( fileName ==null ) {
return null ; 
} 
return this . getClass ( ) . getClassLoader ( ) . getResource ( fileName ) ; 
} 
    }
