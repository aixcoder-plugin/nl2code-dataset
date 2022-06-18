package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld116 extends GenerateMethodBase {
        public void resize ( int [ ] arr , long newSize ) { 
final int numPages = numPages ( newSize ) ; 
if ( numPages > pages . length ) { 
pages = Arrays . copyOf ( pages , ArrayUtil . oversize ( numPages , RamUsageEstimator . NUM_BYTES_OBJECT_REF ) ) ; 
} 
for ( int i = numPages -1 ; i >= 0 && pages [ i ] == null ; -- i ) { 
pages [ i ] = newIntPage ( i ) ; 
} 
for ( int i = numPages ; i < pages . length && pages [ i ] != null ; ++ i ) { 
pages [ i ] = null ; 
releasePage ( i ) ; 
} 
this . size = newSize ; 
} 
    }
