package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Map;

public class AixcoderOld30 extends GenerateMethodBase {
    public <K, V> Map.Entry<K, V> getEntry(Map<K, V> map, K key) {
        if (map == null || key == null) {
            return null;
        }
//        int hash = hash(key);
//        int i = indexFor(hash, table.length);
//        for (Entry<K, V> e = table[i]; e != null; e = e.next) {
//            Object k;
//            if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {
//                return e;
//            }
//        }
        return null;
    }
}
