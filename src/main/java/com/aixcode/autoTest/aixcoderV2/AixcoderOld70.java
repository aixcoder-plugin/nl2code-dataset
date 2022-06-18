package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld70 extends GenerateMethodBase {
        public long elapsedTime ( Calendar start , Calendar end ) { 
if ( start == null || end == null ) { 
throw new IllegalArgumentException ( "The dates must not be null" ) ; 
} 
long startMs = start . getTimeInMillis ( ) ; 
long endMs = end . getTimeInMillis ( ) ; 
return ( endMs - startMs ) ; 
} 
    }
