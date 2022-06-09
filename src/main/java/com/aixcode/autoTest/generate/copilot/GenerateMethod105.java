package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Iterator;

public class GenerateMethod105 extends GenerateMethodBase {

    /**
     * Advances the iterator either forward or backward the specified number of steps. Negative values move backward, and positive values move forward. This is equivalent to repeatedly calling next() or previous().
     */
    public int next(Iterator<Integer> iterator, int n)  {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += iterator.next();
        }
        return result;
    }
}
