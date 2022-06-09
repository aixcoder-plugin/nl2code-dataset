package com.aixcode.autoTest.version1.copilot;

public class Copilot241 {
    /**
     * Choose a pseudo-random element from the specified array.
     */
    public static int random(int[] array) {
        return array[(int) (Math.random() * array.length)];
    }
}
