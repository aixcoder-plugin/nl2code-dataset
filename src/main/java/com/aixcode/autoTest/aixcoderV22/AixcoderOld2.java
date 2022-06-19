package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class AixcoderOld2 extends GenerateMethodBase {
    public HttpURLConnection createHttpConnection(URL url, int connectTimeout, Map<String, String> requestProperties)
        throws IOException {
HttpURLConnection connection = ( HttpURLConnection ) url . openConnection ( ) ; 
connection . setConnectTimeout ( connectTimeout ) ; 
connection . setReadTimeout ( connectTimeout ) ; 
connection . setRequestMethod ( "POST" ) ; 
connection . setRequestProperty ( "Content-Type" , "application/x-www-form-urlencoded" ) ; 
connection . setRequestProperty ( "Content-Length" , "0" ) ; 
if ( requestProperties != null ) { 
for ( Map . Entry < String , String > entry : requestProperties . entrySet ( ) ) { 
connection . setRequestProperty ( entry . getKey ( ) , entry . getValue ( ) ) ; 
} 
} 
return connection ; 
} 
    }
