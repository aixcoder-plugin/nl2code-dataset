package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Calendar;

public class Aixcoder70 extends GenerateMethodBase {
        public long elapsedTime (Calendar start , Calendar end ) {
if ( start == null || end == null ) { 
throw new IllegalArgumentException ( "The dates must not be null" ) ; 
} 
long startMs = start . getTimeInMillis ( ) ; 
long endMs = end . getTimeInMillis ( ) ; 
return ( endMs - startMs ) ; 
} 
    }
