package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Map;

public class GenerateMethod30 extends GenerateMethodBase {
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
