package com.aixcode.autoTest.version1.copilot;

import java.util.List;

public class Copilot56 {
    /**
     * Delete data from start until end index (end inclusive) of a object List.
     */
    public static <T> void delete(List<T> list, int start, int end) {
        for (int i = start; i <= end; i++) {
            list.remove(start);
        }
    }
}
