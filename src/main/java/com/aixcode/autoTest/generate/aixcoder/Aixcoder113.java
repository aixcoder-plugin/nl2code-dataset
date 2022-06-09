package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder113 extends GenerateMethodBase {
    public String getStringfromStringArray(String[] array) {
        String s = "";

        for (int i = 0; i < array.length; i++) {
            s += array[i] + "";
        }

        return s;
    }
}
