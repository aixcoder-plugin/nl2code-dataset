package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder336 {
    public static int average(int a, int b) {
        int sum = a + b;
        return (sum <= 0) ? 0 : (sum >= 255) ? 255 : sum / 2;
    }
}
