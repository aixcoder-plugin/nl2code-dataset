package com.aixcode.autoTest.version1.copilot;

public class Copilot265 {
    /**
     * 随机生成[origin, bound)范围之内的一个int值
     */
    public static int randomInt(int origin, int bound) {
        return (int) (Math.random() * (bound - origin) + origin);
    }
}
