package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder171 extends GenerateMethodBase {
    public String rvZeroAndDot(String s) {
        if (s.isEmpty()) {
            return"0";
        }

        if (s.indexOf(".") > 0) {
            s = s.replaceAll("0+?$", "");
            //如最后一位是.则去掉
            s = s.replaceAll("[.]$", "");
        }

        return s;
    }
}
