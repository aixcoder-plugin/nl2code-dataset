package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder273 {
    public static void checkRange(int value, int min, int max) {
        if ((value < min) || (value > max)) {
            throw new IllegalArgumentException("Value is out of range:" + value);
        }
    }
}
