package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld182 extends GenerateMethodBase {
        public String [ ] filter ( String [ ] word_list ) { 
List < String > results = new ArrayList < String > ( ) ; 
for ( String w : word_list ) { 
//if ( ! FILTER_CHARS . contains ( w ) ) {
results . add ( w . toLowerCase ( ) ) ; 
//}
} 
return results . toArray ( new String [ results . size ( ) ] ) ; 
} 
    }
