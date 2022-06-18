package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld146 extends GenerateMethodBase {
        public Set < String > getMethods ( ClassLoader classLoader , String className ) { 
if ( ! methods . containsKey ( className ) ) { 
methods . put ( className , new HashSet < > ( ) ) ; 
} 
return methods . get ( className ) ; 
} 
    }
