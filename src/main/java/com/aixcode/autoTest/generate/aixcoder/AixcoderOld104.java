package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld104 extends GenerateMethodBase {
    public void putShort(byte[] data, byte b, short s)
        { 
int length = data . length ; 
//if ( length + 2 > data . length ) {
//enlarge ( 2 ) ;
//}
data [ length ++ ] = b ; 
data [ length ++ ] = ( byte ) ( s >>> 8 ) ; 
data [ length ] = ( byte ) s ; 
} 
    }
