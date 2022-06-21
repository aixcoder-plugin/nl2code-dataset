package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld153 extends GenerateMethodBase {
    public byte[] calculateC2(byte[] m, byte[] t)
        { 
if ( m == null || m . length == 0 || t == null || t . length == 0 ) { 
return null ; 
} 
byte [ ] c2 = new byte [ m . length ] ; 
for ( int i = 0 ; i < m . length ; i ++ ) { 
c2 [ i ] = ( byte ) ( m [ i ] ^ t [ i % t . length ] ) ; 
} 
return c2 ; 
} 
    }
