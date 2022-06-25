package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class AixcoderOld140 extends GenerateMethodBase {
    public String toString(ByteBuffer buffer, int position, int length, Charset charset)
        { 
if ( buffer == null ) 
return null ; 
byte [ ] array = buffer . hasArray ( ) ? buffer . array ( ) : null ; 
if ( array == null ) { 
ByteBuffer buf = buffer . duplicate ( ) ; 
buf . position ( position ) ; 
buf . limit ( position + length ) ; 
return new String ( buf . array ( ) , buf . arrayOffset ( ) , buf . capacity ( ) , charset ) ; 
} 
return new String ( array , buffer . arrayOffset ( ) + position , length , charset ) ; 
} 
    }
