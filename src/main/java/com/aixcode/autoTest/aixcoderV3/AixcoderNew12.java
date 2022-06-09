package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.List;

public class AixcoderNew12 extends GenerateMethodBase {
    public String getValue(List<String> list, int index) {
        if ((index < 0) || (index >= list.size())) {
            return null;
        }
        return list.get(index);
    }
}
