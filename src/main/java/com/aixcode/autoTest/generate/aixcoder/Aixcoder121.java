package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder121 extends GenerateMethodBase {
    public int getNextSlash(String path, int index) {
        int nextSlash = path.indexOf('/', index + 1);

        if (nextSlash == -1 || nextSlash == path.length() - 1) {
            return -1;
        }

        return nextSlash;
    }
}
