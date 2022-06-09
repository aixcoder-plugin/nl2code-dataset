package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod109 extends GenerateMethodBase {

    /**
     * subtract b from a
     */public String[] sub(String[] a, String[] b) {
        String[] result = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] + "-" + b[i];
        }
        return result;
    }

}
