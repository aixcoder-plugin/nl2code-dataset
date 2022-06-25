package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.HashSet;
import java.util.Map;

public class Aixcoder90 extends GenerateMethodBase {
        public void addToSet (Map< String , HashSet< Integer >> map , String key , Integer value ) {
HashSet < Integer > set = map . get ( key ) ; 
if ( set == null ) { 
set = new HashSet < Integer > ( ) ; 
map . put ( key , set ) ; 
} 
set . add ( value ) ; 
} 
    }
