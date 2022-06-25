package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.List;

public class AixcoderOld73 extends GenerateMethodBase {
    public <T> void delete(List<T> list, int start, int end) {
        if (start < 0 || end < start)
            return;
        if (end > list.size())
            end = list.size();
        for (int i = end - 1; i >= start; i--) {
            list.remove(i);
        }
    }
}
