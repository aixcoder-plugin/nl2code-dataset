package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld101 extends GenerateMethodBase {
    public int[] copy(int[] arr)
        { 
if ( arr == null ) { 
return null ; 
} 
int [ ] copy = new int [ arr . length ] ; 
for ( int i = 0 ; i < arr . length ; i ++ ) { 
copy [ i ] = arr [ i ] ; 
} 
return copy ; 
} 
    }
