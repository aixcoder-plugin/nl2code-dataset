package com.aixcode.autoTest.version1.aixcoder;

import java.util.List;

public class Aixcoder11 {
    /**
     * Retrieves the value by specified int index of the given List.
     */
    public static String getValue(List<String> list, int index) {
        if (list == null || index < 0 || index >= list.size()) {
            return null;
        }

        return list.get(index);
    }
}
