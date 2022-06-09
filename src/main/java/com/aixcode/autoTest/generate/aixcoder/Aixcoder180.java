package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder180 extends GenerateMethodBase {
    /**
     *  Check if a string is binary, which is composed of 0/1, and string length is multiple of 8.
     */
    @Override
    public boolean isBin(String str) {
        if (str == null || str.length() % 8 != 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i += 8) {
            if (!(((str.charAt(i) | str.charAt(i + 1) | str.charAt(i + 2) | str.charAt(i + 3) | str.charAt(i + 4) | str.charAt(i + 5) | str.charAt(i + 6) | str.charAt(i + 7)) & 1) == 1)) {
                return false;
            }
        }

        return true;
    }
}
