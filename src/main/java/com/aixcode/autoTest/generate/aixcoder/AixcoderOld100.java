package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

public class AixcoderOld100 extends GenerateMethodBase {
    public String canonicalEncodingName(String encoding)
        { 
if ( encoding == null ) { 
return null ; 
} 
try { 
return Charset. forName ( encoding ) . name ( ) ;
} catch ( IllegalCharsetNameException icne ) {
return encoding ; 
} catch ( UnsupportedCharsetException uce ) {
return encoding ; 
} 
} 
    }
