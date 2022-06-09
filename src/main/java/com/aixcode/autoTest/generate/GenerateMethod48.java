package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Collection;
import java.util.Set;

public class GenerateMethod48 extends GenerateMethodBase {
    /**
     * Adds all of the elements in collection to the Set.
     */
    public void addAll(Set<Integer> set, Collection<Integer> collection)
    {
        for (Integer i : collection)
        {
            set.add(i);
        }
    }

}
