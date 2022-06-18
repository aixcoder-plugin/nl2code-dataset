package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld115 extends GenerateMethodBase {
        public String [ ] toTimestampStrs ( long [ ] timestamps ) { 
if ( timestamps == null ) { 
return null ; 
} 
String [ ] result = new String [ timestamps . length ] ; 
for ( int i = 0 ; i < timestamps . length ; ++ i ) { 
result [ i ] = Long . toString ( timestamps [ i ] ) ; 
} 
return result ; 
} 
    }
