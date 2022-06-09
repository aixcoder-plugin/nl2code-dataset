package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Random;

public class AixcoderAuto80 extends GenerateMethodBase {
    public int randomInt(int origin, int bound) {
        Random random = new Random();
        return origin + random.nextInt(bound - origin);
    }
}
