package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder116 extends GenerateMethodBase {
        public int [ ] resize ( int [ ] arr , long newSize ) { 
int [ ] newArr = new int [ ( int ) newSize ] ; 
if ( arr != null ) { 
System . arraycopy ( arr , 0 , newArr , 0 , Math . min ( arr . length , (int) newSize ) ) ;
} 
return newArr ; 
} 
    }
