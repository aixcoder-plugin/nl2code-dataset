package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.IOException;
import java.io.OutputStream;

public class AixcoderOld79 extends GenerateMethodBase {
    public void write(byte[] b, int off, int len, OutputStream outputStream)
        throws IOException {
if ( b == null ) { 
throw new NullPointerException ( ) ; 
} else if ( ( off < 0 ) || ( off > b . length ) || ( len < 0 ) || ( ( off + len ) > b . length ) || ( ( off + len ) < 0 ) ) { 
throw new IndexOutOfBoundsException ( ) ; 
} else if ( len == 0 ) { 
return ; 
} 
//int newcount = count + len ;
//if ( newcount > buf . length ) {
//buf = Utils . copyOf ( buf , Math . max ( buf . length << 1 , newcount ) ) ;
//}
//System . arraycopy ( b , off , buf , count , len ) ;
//count = newcount ;
} 
    }
