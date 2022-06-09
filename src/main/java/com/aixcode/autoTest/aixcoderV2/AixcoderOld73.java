package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.List;

public class AixcoderOld73 extends GenerateMethodBase {
    public <T> void delete(List<T> list, int start, int end) {
        if (list == null)
            return;
        if (start < 0 || end < 0 || start > end || end > list.size())
            return;
        if (start == end) {
            list.clear();
            return;
        }
        if (end == list.size()) {
            int s = start;
            start = end - 1;
            end = s;
        }
        T[] arr = list.toArray((T[]) new Object[list.size() - (end - start)]);
        int i = 0;
        for (; i < arr.length; i++) {
            if (i >= start && i < end)
                arr[i] = arr[i + 1];
        }
        list.clear();
        for (T t : arr) list.add(t);
    }
}
