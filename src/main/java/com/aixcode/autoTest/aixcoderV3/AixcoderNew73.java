package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.List;

public class AixcoderNew73 extends GenerateMethodBase {
    public <T> void delete(List<T> list, int start, int end) {
        if (list == null)
            return;
        if (start < 0)
            start = 0;
        if (end > list.size())
            end = list.size();
        if (start > end)
            return;
        for (int i = 0; i < (end - start); i++) {
            list.remove(start);
        }
    }
}
