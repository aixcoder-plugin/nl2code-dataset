package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder107 extends GenerateMethodBase {
    public boolean checkNotNullOrEmpty(int[] array) {
        if (array == null) {
            return false;
        }

        return array.length != 0;
    }
}
