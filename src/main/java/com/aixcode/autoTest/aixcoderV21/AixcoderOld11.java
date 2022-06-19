package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Random;

public class AixcoderOld11 extends GenerateMethodBase {
    public void shuffle(int[] array)
        { 
if ( array == null ) 
throw new NullPointerException ( "argument array is null" ) ; 
int n = array . length ; 
for ( int i = 0 ; i < n ; i ++ ) { 
// between i and n-1
int r = i + new Random().nextInt ( n - i ) ;
int temp = array [ i ] ; 
array [ i ] = array [ r ] ; 
array [ r ] = temp ; 
} 
} 
    }
