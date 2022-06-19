package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Random;

public class AixcoderOld13 extends GenerateMethodBase {
    public String randomString(int length, String alphabet)
        { 
if ( alphabet == null ) { 
return null ; 
} 
StringBuilder sb = new StringBuilder ( length ) ; 
for ( int i = 0 ; i < length ; i ++ ) { 
sb . append ( alphabet . charAt ( new Random().nextInt( alphabet . length ( ) ) ) ) ;
} 
return sb . toString ( ) ; 
} 
    }
