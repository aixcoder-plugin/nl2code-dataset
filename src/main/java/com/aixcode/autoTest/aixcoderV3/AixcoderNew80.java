package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Random;

public class AixcoderNew80 extends GenerateMethodBase {
    public int randomInt(int origin, int bound) {
        Random random = new Random();
        return random.nextInt(bound - origin) + origin;
    }
}
