package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod94 extends GenerateMethodBase {
    /**
     * Choose a pseudo-random element from the specified array.
     */
    public int random(int[] array) {
        return array[(int) (Math.random() * array.length)];
    }
}
