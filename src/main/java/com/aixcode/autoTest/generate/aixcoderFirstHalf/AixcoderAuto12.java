package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.List;

public class AixcoderAuto12 extends GenerateMethodBase {
    /**
     * Retrieves the value by specified int index of the given List.
     */
    public String getValue(List<String> list, int index) {
        if (list == null || index < 0 || index >= list.size()) {
            return null;
        }

        return list.get(index);
    }
}
