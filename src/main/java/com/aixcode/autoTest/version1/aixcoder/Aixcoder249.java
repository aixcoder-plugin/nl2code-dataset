package com.aixcode.autoTest.version1.aixcoder;

import java.util.Map;
import java.util.Set;

public class Aixcoder249 {
    /**
     * 移除 map 中的 null 或者 空字符串
     */
    public static void removeNullValue(Map<String, Object> map) {
        Set<String> keySet = map.keySet();

        for (String key : keySet) {
            Object obj = map.get(key);

            if (obj == null || "".equals(obj.toString().trim())) {
                map.remove(key);
            }
        }
    }
}
