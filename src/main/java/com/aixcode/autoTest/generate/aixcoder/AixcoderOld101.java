package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld101 extends GenerateMethodBase {
    public int[] copy(int[] arr)
        { 
if ( arr == null ) { 
return null ; 
} 
int [ ] copy = new int [ arr . length ] ; 
System . arraycopy ( arr , 0 , copy , 0 , arr . length ) ; 
return copy ; 
} 
    }
