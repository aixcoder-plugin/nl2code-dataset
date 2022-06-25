package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder104 extends GenerateMethodBase {
        public void putShort ( byte [ ] data , byte b , short s ) { 
int length = data . length ; 
//if ( length + 2 > data . length ) {
//enlarge ( 2 ) ;
//}
data [ length ++ ] = b ; 
data [ length ++ ] = ( byte ) ( s >>> 8 ) ; 
data [ length ] = ( byte ) s ; 
} 
    }
