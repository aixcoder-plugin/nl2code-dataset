package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Collection;
import java.util.Set;

public class AixcoderNew48 extends GenerateMethodBase {
    public void addAll(Set<Integer> set, Collection<Integer> collection) {
        for (Integer i : collection) {
            set.add(i.intValue());
        }
    }
}
