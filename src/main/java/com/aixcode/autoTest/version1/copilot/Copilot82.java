package com.aixcode.autoTest.version1.copilot;

import java.util.ArrayList;

public class Copilot82 {
    /**
     * Merges the given two lists to a new list, but eliminating duplicates elements.
     */
    public static <T> ArrayList<T> merge(ArrayList<T> list1, ArrayList<T> list2) {
        ArrayList<T> result = new ArrayList<>();
        for (T t : list1) {
            if (!result.contains(t)) {
                result.add(t);
            }
        }
        for (T t : list2) {
            if (!result.contains(t)) {
                result.add(t);
            }
        }
        return result;
    }
}
