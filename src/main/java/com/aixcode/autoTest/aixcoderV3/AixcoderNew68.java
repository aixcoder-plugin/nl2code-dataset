package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.ArrayList;

public class AixcoderNew68 extends GenerateMethodBase {
    public String removeLast(ArrayList<String> list) {
        if (list.size() == 0) {
            return null;
        }
        return list.remove(list.size() - 1);
    }
}
