package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.IOException;
import java.io.OutputStream;

public class AixcoderOld79 extends GenerateMethodBase {
    public void write(byte[] b, int off, int len, OutputStream outputStream)
        throws IOException {
if ( len < 0 ) { 
throw new IndexOutOfBoundsException ( ) ; 
} 
int c = 0 ; 
while ( c < len ) { 
int i = off + c ; 
if ( i < b . length ) { 
outputStream . write ( b , i , 1 ) ; 
} else { 
outputStream . write ( 0 ) ; 
} 
c ++ ; 
} 
} 
    }
