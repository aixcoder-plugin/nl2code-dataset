package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld0 extends GenerateMethodBase {
        public String collectionToCommaDelimitedString ( List < String > coll ) { 
if ( coll == null || coll . size ( ) == 0 ) { 
return "" ; 
} 
StringBuilder sb = new StringBuilder ( ) ; 
Iterator < String > it = coll . iterator ( ) ; 
while ( it . hasNext ( ) ) { 
sb . append ( it . next ( ) ) ; 
if ( it . hasNext ( ) ) { 
sb . append ( ", " ) ; 
} 
} 
return sb . toString ( ) ; 
} 
    }
