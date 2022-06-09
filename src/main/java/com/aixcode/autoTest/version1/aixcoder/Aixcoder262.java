package com.aixcode.autoTest.version1.aixcoder;

import java.util.LinkedList;

public class Aixcoder262 {
    /**
     * Returns the largest value in linked list.
     */
    public static int getMax(LinkedList<Integer> list) {
        int max = list.getFirst();

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        return max;
    }
}
