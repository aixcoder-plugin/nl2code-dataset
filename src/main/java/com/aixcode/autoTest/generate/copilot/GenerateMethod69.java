package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.LinkedList;

public class GenerateMethod69 extends GenerateMethodBase {
    /**
     * Returns the largest value in linked list.
     */
    public int getMax(LinkedList<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
}
