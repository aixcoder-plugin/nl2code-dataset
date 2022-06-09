package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.ArrayList;

public class AixcoderAuto68 extends GenerateMethodBase {
    /**
     * Removes and returns last element in list, return null if empty.
     */
    public String removeLast(ArrayList<String> list) {
        if (list.size() == 0)
            return null;

        return list.remove(list.size() - 1);
    }
}
