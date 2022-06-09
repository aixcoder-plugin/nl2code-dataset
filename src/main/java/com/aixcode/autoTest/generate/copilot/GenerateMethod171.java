package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod171 extends GenerateMethodBase {
    /**
     * 去掉浮点数多余的0
     */
    public String rvZeroAndDot(String s) {
        String result = s;
        if (s.contains(".")) {
            int index = s.indexOf(".");
            String temp = s.substring(index + 1);
            if (temp.equals("0")) {
                result = s.substring(0, index);
            }
        }
        return result;
    }
}
