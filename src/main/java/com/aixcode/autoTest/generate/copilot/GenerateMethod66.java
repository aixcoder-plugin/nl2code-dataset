package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.ArrayList;

public class GenerateMethod66 extends GenerateMethodBase {
    /**
     * Merges the given two lists to a new list, but eliminating duplicates elements.
     */
    public <T> ArrayList<T> merge(ArrayList<T> list1, ArrayList<T> list2) {
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
