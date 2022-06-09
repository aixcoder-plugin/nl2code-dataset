package com.aixcode.autoTest.version1.aixcoder;

import java.util.Map;

public class Aixcoder78 {
    /**
     * Returns the entry associated with the specified key in map.
     */
    public Map.Entry<String, Object> getEntry(Map<String, Object> map, String key) {
        if (map == null || key == null) {
            return null;
        }

        return map.entrySet().stream().filter(entry-> key.equals(entry.getKey())).findFirst().orElse(null);
    }
}
