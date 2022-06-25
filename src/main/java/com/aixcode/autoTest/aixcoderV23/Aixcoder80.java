package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Random;

public class Aixcoder80 extends GenerateMethodBase {
        public int randomInt ( int origin , int bound ) { 
Random random = new Random ( ) ;
return origin + random . nextInt ( bound - origin ) ; 
} 
    }
