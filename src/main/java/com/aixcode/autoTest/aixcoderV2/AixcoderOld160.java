package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld160 extends GenerateMethodBase {
        public List < String > doDrawRandom ( List < String > users , int count ) { 
List < String > result = new ArrayList < > ( ) ; 
for ( int i = 0 ; i < count ; i ++ ) { 
result . add ( users . get ( getRandom ( users . size ( ) ) ) ) ; 
} 
return result ; 
} 
    }
