package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.LinkedList;

public class AixcoderNew69 extends GenerateMethodBase {
    public int getMax(LinkedList<Integer> list) {
        int max = -1;
        for (Integer i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
