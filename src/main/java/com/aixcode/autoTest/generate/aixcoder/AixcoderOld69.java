package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.LinkedList;

public class AixcoderOld69 extends GenerateMethodBase {
    public int getMax(LinkedList<Integer> list) {
        int max = list.getFirst();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
}
