package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.IOException;
import java.io.Reader;

public class AixcoderOld4 extends GenerateMethodBase {
    public void close(Reader reader)
        { 
if ( reader != null ) { 
try { 
reader . close ( ) ; 
} catch ( IOException e ) {
} 
} 
} 
    }
