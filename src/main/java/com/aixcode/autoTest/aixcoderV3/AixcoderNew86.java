package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Collection;

public class AixcoderNew86 extends GenerateMethodBase {
    public boolean containsKey(Collection<String> collection, String key) {
        if (collection == null || key == null) {
            return false;
        }
        return collection.contains(key);
    }
}
