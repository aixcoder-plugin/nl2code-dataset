package com.aixcode.autoTest.version1.aixcoder;

import java.util.Map;

public class Aixcoder404 {
    public static int size(Map<String, String> map) {
        int size = 0;

        for (String key : map.keySet()) {
            size += map.get(key).length();
        }

        return size;
    }
}
