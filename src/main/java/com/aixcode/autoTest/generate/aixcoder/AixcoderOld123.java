package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld123 extends GenerateMethodBase {
    public int floor(int x, int quantum)
        { 
int i = x / quantum ; 
return x - ( i * quantum ) ; 
} 
    }
