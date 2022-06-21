package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.List;

public class GenerateMethod73 extends GenerateMethodBase {
    /**
     * Delete data from start until end index (end inclusive) of a object List.
     */
    public <T> void delete(List<T> list, int start, int end) {
        for (int i = start; i <= end; i++) {
            list.remove(start);
        }
    }
}
