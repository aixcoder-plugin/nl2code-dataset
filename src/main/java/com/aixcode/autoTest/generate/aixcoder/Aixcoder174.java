package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder174 extends GenerateMethodBase {
    public boolean isInteger(String numberString) {
        try {
            Integer.parseInt(numberString);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
