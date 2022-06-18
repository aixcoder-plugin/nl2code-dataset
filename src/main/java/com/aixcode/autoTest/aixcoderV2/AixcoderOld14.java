package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld14 extends GenerateMethodBase {
        public void init ( int [ ] [ ] arr , int n ) { 
if ( arr == null || arr . length == 0 || arr [ 0 ] . length == 0 ) { 
return ; 
} 
int [ ] [ ] dp = new int [ n ] [ n ] ; 
for ( int i = 0 ; i < n ; i ++ ) { 
Arrays . fill ( dp [ i ] , -1 ) ; 
} 
for ( int i = 0 ; i < arr . length ; i ++ ) { 
for ( int j = 0 ; j < arr [ 0 ] . length ; j ++ ) { 
if ( arr [ i ] [ j ] != -1 ) { 
dp [ i ] [ j ] = arr [ i ] [ j ] ; 
} 
} 
} 
for ( int i = 0 ; i < n ; i ++ ) { 
for ( int j = 0 ; j < n ; j ++ ) { 
if ( dp [ i ] [ j ] != -1 ) { 
arr [ i ] [ j ] = dp [ i ] [ j ] ; 
} 
} 
} 
} 
    }
