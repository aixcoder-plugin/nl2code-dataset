package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.List;

public class AixcoderAuto73 extends GenerateMethodBase {
    /**
     * Delete data from start until end index (end inclusive) of a object List.
     */
    public <T> void delete (List<T> list, int start, int end) {
        if (start < 0 || end < start)
            return;

        if (end > list.size())
            end = list.size();

        for (int i = end - 1; i >= start; i--) {
            list.remove(i);
        }
    }
}
