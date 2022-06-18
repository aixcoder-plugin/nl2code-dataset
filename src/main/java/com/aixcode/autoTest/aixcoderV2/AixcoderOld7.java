package com.aixcode.autoTest.aixcoderV2;

import java.net.URL;
import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld7 extends GenerateMethodBase {
        public Properties getProperties ( String url ) { 
Properties properties = new Properties ( ) ; 
try { 
properties . load ( new URL( url ) . openStream ( ) ) ;
} catch ( IOException e ) { 
e . printStackTrace ( ) ; 
} 
return properties ; 
} 
    }
