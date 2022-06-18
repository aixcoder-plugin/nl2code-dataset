package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld79 extends GenerateMethodBase {
        public void write ( byte [ ] b , int off , int len , OutputStream outputStream ) IOException { 
if ( b == null ) { 
throw new NullPointerException ( ) ; 
( off < 0 || len < 0 || off + len > b . length ) { 
throw new IndexOutOfBoundsException ( ) ; 
} 
return ; 
} 
if ( ( off < 0 ) || ( off > b . length ) || ( len < 0 ) || ( ( off + len ) > b . length ) || ( ( off + len ) < 0 ) ) { 
throw new IndexOutOfBoundsException ( ) ; 
} 
for ( int i = 0 ; i < len ; i ++ ) { 
write ( b [ off + i ] ) ; 
} 
} 
    }
