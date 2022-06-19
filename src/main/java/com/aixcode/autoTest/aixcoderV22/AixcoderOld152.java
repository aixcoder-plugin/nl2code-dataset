package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.UnsupportedEncodingException;

public class AixcoderOld152 extends GenerateMethodBase {
    public String toMd5Code(String str)
        { 
if ( null == str ) { 
return null ; 
} 
String code = "" ; 
try { 
code = new String ( str . getBytes ( "UTF-8" ) ) ; 
} catch ( UnsupportedEncodingException e ) {
e . printStackTrace ( ) ; 
} 
return code ; 
} 
    }
