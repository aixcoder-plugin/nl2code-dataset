package com.aixcode.autoTest.version1.aixcoder;

import java.util.ArrayList;

public class Aixcoder20 {
    /**
     * Removes and returns last element in list, return null if empty.
     */
    public static String removeLast(ArrayList<String> list) {
        if (list.size() == 0)
            return null;

        return list.remove(list.size() - 1);
    }
}
