package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Collection;

public class GenerateMethod86 extends GenerateMethodBase {
    /**
     * Returns true if the collection contains an element for the key.
     */
    public boolean containsKey(Collection<String> collection, String key) {
        for (String k : collection) {
            if (k.equals(key)) {
                return true;
            }
        }
        return false;
    }
}
