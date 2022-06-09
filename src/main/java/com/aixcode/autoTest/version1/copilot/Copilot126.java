package com.aixcode.autoTest.version1.copilot;

import java.util.Collection;

public class Copilot126 {
    /**
     * Returns true if the collection contains an element for the key.
     */
    public static boolean containsKey(Collection<String> collection, String key) {
        for (String k : collection) {
            if (k.equals(key)) {
                return true;
            }
        }
        return false;
    }
}
