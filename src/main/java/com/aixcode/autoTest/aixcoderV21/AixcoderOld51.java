package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld51 extends GenerateMethodBase {
    public int hashCode(byte[] byteArr)
        { 
int hashCode = 0 ; 
for ( int i = 0 ; i < byteArr . length ; i ++ ) hashCode = 31 * hashCode + byteArr [ i ] ;
for ( int i = 0 ; i < byteArr.length ; i ++ ) hashCode = 31 * hashCode + ( byteArr [ i ] & 0xFF ) ;
return hashCode ^ byteArr.length ;
} 
    }
