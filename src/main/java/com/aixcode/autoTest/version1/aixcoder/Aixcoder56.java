package com.aixcode.autoTest.version1.aixcoder;

import java.util.List;

public class Aixcoder56 {
    /**
     * Delete data from start until end index (end inclusive) of a object List.
     */
    public static<T> void delete (List<T> list, int start, int end) {
        if (start < 0 || end < start)
            return;

        if (end > list.size())
            end = list.size();

        for (int i = end - 1; i >= start; i--) {
            list.remove(i);
        }
    }
}
