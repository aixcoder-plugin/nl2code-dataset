package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld69 extends GenerateMethodBase {
        public int getMax ( LinkedList < Integer > list ) { 
int max = list . getLast ( ) ; 
int temp = 0 ; 
while ( list . size ( ) > 1 ) { 
temp = list . get ( list . size ( ) -2 ) ; 
list . remove ( list . size ( ) -1 ) ; 
list . add ( temp ) ; 
} 
return max ; 
} 
    }
