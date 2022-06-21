package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.ArrayList;

public class GenerateMethod68 extends GenerateMethodBase {
    /**
     * Removes and returns last element in list, return null if empty.
     */
    public String removeLast(ArrayList<String> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }
}
