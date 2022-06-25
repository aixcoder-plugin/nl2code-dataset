package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Random;

public class AixcoderOld94 extends GenerateMethodBase {
    public int random(int[] array)
        { 
int index = new Random(). nextInt ( array . length ) ;
return array [ index ] ; 
} 
    }
