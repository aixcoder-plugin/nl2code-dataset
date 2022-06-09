package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.ArrayList;

public class AixcoderNew66 extends GenerateMethodBase {
    public <T> ArrayList<T> merge(ArrayList<T> list1, ArrayList<T> list2) {
        ArrayList<T> merged = (ArrayList<T>) list1.clone();
        for (T elt : list2) {
            if (!merged.contains(elt)) {
                merged.add(elt);
            }
        }
        return merged;
    }
}
