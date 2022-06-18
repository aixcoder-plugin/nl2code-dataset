package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld13 extends GenerateMethodBase {
        public String randomString ( int length , String alphabet ) { 
if ( alphabet == null || alphabet . length ( ) == 0 ) { 
throw new IllegalArgumentException ( "Alphabet must not be null or empty." ) ; 
} 
if ( length < 0 ) { 
throw new IllegalArgumentException ( "Length must not be negative." ) ; 
} 
if ( length > alphabet . length ( ) ) { 
throw new IllegalArgumentException ( "Length must not exceed alphabet length." ) ; 
} 
StringBuilder sb = new StringBuilder ( length ) ; 
for ( int i = 0 ; i < length ; i ++ ) { 
sb . append ( alphabet . charAt ( nextInt ( alphabet . length ( ) ) ) ) ; 
} 
return sb . toString ( ) ; 
} 
    }
