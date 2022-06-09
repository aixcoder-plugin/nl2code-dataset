package com.aixcode.autoTest.version1.aixcoder;

import java.util.Random;

public class Aixcoder265 {
    public static int randomInt(int origin, int bound) {
        Random random = new Random();
        return origin + random.nextInt(bound - origin);
    }
}
