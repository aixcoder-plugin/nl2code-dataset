package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class AixcoderOld7 extends GenerateMethodBase {
    public Properties getProperties(String url)
        { 
Properties properties = new Properties ( ) ; 
try { 
properties . load ( new URL( url ) . openStream ( ) ) ;
} catch ( IOException e ) {
e . printStackTrace ( ) ; 
} 
return properties ; 
} 
    }
