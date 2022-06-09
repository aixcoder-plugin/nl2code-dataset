package com.aixcode.autoTest.version1.copilot;

import java.util.Map;

public class Copilot78 {
    /**
     * Returns the entry associated with the specified key in map.
     */
    public <K,V> Map.Entry<K, V> getEntry(Map<K,V> map, K key)
    {
        for (Map.Entry<K, V> e : map.entrySet())
        {
            if (e.getKey().equals(key))
            {
                return e;
            }
        }
        return null;
    }
}
