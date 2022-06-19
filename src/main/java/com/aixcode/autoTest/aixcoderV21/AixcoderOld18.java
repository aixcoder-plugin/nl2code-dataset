package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld18 extends GenerateMethodBase {
    public byte[] readBytes(java.io.InputStream in, int len)
        throws java . io . IOException { 
if ( in == null ) 
return null ; 
int i = 0 ; 
int available = len ;
if ( available < len ) { 
len = available ; 
} 
byte [ ] buf = new byte [ len ] ; 
if ( available > 0 ) { 
i = in . read ( buf , 0 , available ) ; 
if ( i > 0 ) { 
//this . count += i ;
} 
} 
return buf ; 
} 
    }
