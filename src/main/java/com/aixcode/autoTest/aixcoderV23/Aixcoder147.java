package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.concurrent.FutureTask;

public class Aixcoder147 extends GenerateMethodBase {
        public String getPid ( FutureTask t ) {
if ( t == null ) { 
return null ; 
} 
return t . isCancelled ( ) ? null : t . getClass ( ) . getName ( ) ; 
} 
    }
