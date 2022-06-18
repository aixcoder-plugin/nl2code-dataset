package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld105 extends GenerateMethodBase {
        public int next ( Iterator < Integer > iterator , int n ) { 
int result = 0 ; 
while ( iterator . hasNext ( ) ) { 
int i = iterator . next ( ) ; 
if ( i < 0 ) { 
result = i + n ; 
continue ; 
} 
result = i ; 
} 
return result ; 
} 
    }
