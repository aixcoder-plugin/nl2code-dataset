package com.aixcode.autoTest.version1.aixcoder;

import java.util.Collection;
import java.util.Set;

public class Aixcoder373 {
    /**
     * Adds all of the elements in collection to the Set.
     */
    public static void addAll(Set<Integer> set, Collection<Integer> collection)
    {
        for (Integer i : collection)
        {
            set.add(i);
        }
    }

}
