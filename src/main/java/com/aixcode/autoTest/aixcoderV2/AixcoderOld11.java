package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld11 extends GenerateMethodBase {
        public void shuffle ( int [ ] array ) { 
if ( array == null ) 
throw new NullPointerException ( "argument array is null" ) ; 
int n = array . length ; 
for ( int i = 0 ; i < n ; i ++ ) { 
// between i and n-1
int r = i + uniform ( n - i ) ; 
int temp = array [ i ] ; 
array [ i ] = array [ r ] ; 
array [ r ] = temp ; 
} 
} 
    }
