package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Base64;

public class Aixcoder165 extends GenerateMethodBase {
        public byte [ ] base64decode ( String base64string ) { 
if ( base64string . length ( ) < 1 ) { 
return null ; 
} 
return Base64. getDecoder ( ) . decode ( base64string ) ;
} 
    }
