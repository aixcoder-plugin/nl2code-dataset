package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.net.MalformedURLException;
import java.net.URL;

public class Aixcoder154 extends GenerateMethodBase {
        public URL getUrlFile (String fileName ) {
URL url = null ; 
if ( fileName . startsWith ( "http" ) ) { 
try { 
url = new URL ( fileName ) ; 
} catch ( MalformedURLException e ) {
e . printStackTrace ( ) ; 
} 
} else { 
ClassLoader classLoader = Thread . currentThread ( ) . getContextClassLoader ( ) ; 
if ( classLoader != null ) { 
url = classLoader . getResource ( fileName ) ; 
} 
} 
return url ; 
} 
    }
