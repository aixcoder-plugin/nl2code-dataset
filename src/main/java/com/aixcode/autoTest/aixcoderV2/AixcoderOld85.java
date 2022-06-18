package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld85 extends GenerateMethodBase {
        public String appendTrailing ( String str , String trailing ) { 
if ( str == null || str . isEmpty ( ) ) { 
return null ; 
} 
if ( trailing==null ) {
return trailing ; 
} 
if ( trailing=="" ) {
return str ; 
} 
if ( str . endsWith ( "\n" ) ) { 
return str + trailing ; 
} 
if ( str . endsWith ( "\r" ) ) { 
return str . concat ( trailing ) ; 
} 
return str + "\n" + trailing ; 
} 
    }
