package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Iterator;

public class Aixcoder105 extends GenerateMethodBase {
    public int next(Iterator<Integer> iterator, int n) {
        int result = 0;

        while (iterator.hasNext()) {
            int i = iterator.next();

            if (i < 0) {
                result = i + n;
                continue;
            }

            result = i;
        }

        return result;
    }

}
