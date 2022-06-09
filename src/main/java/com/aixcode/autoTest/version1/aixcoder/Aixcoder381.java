package com.aixcode.autoTest.version1.aixcoder;

import java.util.Map;

public class Aixcoder381 {
    public void remove(Map<Integer, String> mapObj, Integer key) {
        if (mapObj == null || key == null) {
            return;
        }

        mapObj.remove(key);
    }
}
