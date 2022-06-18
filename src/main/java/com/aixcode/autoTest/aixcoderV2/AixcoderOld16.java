package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld16 extends GenerateMethodBase {
        public int hashCode ( double [ ] vector ) { 
if ( isNaN ( vector ) ) { 
return 9 ; 
} 
int h = 1 ; 
for ( double aVector : vector ) { 
h = 31 * h + ( int ) ( aVector + 0.5 ) ; 
} 
return h ; 
} 
    }
