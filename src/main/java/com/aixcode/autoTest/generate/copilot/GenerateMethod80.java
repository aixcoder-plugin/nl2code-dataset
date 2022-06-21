package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod80 extends GenerateMethodBase {
    /**
     * 随机生成[origin, bound)范围之内的一个int值
     */
    public int randomInt(int origin, int bound) {
        return (int) (Math.random() * (bound - origin) + origin);
    }
}
