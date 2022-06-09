package com.aixcode.autoTest.version1.aixcoder;

import java.util.ArrayList;

public class Aixcoder82 {
    /**
     * Merges the given two lists to a new list, but eliminating duplicates elements.
     */
    public static<T> ArrayList<T> merge(ArrayList<T> list1, ArrayList<T> list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ArrayList<T> result = new ArrayList<T>();
        result.addAll(list1);

        for (T elt : list2) {
            if (!result.contains(elt)) {
                result.add(elt);
            }
        }

        return result;
    }
}
