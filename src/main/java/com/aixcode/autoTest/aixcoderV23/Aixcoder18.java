package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder18 extends GenerateMethodBase {
        public byte [ ] readBytes ( java . io . InputStream in , int len ) throws java . io . IOException { 
byte [ ] buf = new byte [ len ] ; 
int count = 0 ; 
while ( count < len ) { 
int numRead = in . read ( buf , count , len - count ) ; 
if ( numRead < 0 ) { 
throw new java . io . EOFException ( ) ; 
} 
count += numRead ; 
} 
return buf ; 
} 
    }
