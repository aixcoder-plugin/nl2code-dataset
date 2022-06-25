package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Properties;

public class Aixcoder7 extends GenerateMethodBase {
        public Properties getProperties (String url ) {
Properties properties = new Properties ( ) ; 
try { 
properties . load ( new InputStreamReader( new URL( url ) . openStream ( ) , "utf-8" ) ) ;
} catch ( IOException e ) {
e . printStackTrace ( ) ; 
} 
return properties ; 
} 
    }
