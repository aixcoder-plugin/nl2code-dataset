package com.aixcode.autoTest.version1.copilot;

import java.util.ArrayList;

public class Copilot20 {
    /**
     * Removes and returns last element in list, return null if empty.
     */
    public static String removeLast(ArrayList<String> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }
}
