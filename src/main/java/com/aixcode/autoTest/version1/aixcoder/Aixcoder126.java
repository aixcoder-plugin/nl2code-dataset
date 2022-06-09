package com.aixcode.autoTest.version1.aixcoder;

import java.util.Collection;

public class Aixcoder126 {
    public static boolean containsKey(Collection<String> collection, String key) {
        if (collection == null || key == null) {
            return false;
        }

        return collection.contains(key);
    }
}
