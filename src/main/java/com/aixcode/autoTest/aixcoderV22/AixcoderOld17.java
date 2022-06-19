package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

public class AixcoderOld17 extends GenerateMethodBase {
    public Charset charsetForName(String charsetName)
        { 
if ( charsetName == null ) { 
return null ; 
} 
try { 
return Charset . forName ( charsetName ) ; 
} catch ( IllegalCharsetNameException icne ) {
throw new IllegalArgumentException ( "Unsupported charset " + charsetName , icne ) ; 
} catch ( UnsupportedCharsetException uce ) {
throw new IllegalArgumentException ( "Unsupported charset " + charsetName , uce ) ; 
} 
} 
    }
