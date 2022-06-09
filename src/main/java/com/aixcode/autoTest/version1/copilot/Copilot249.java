package com.aixcode.autoTest.version1.copilot;

import java.util.Map;

public class Copilot249 {
    /**
     * 移除 map 中的 null 或者 空字符串
     */
    public static void removeNullValue(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() == null || entry.getValue().equals("")) {
                map.remove(entry.getKey());
            }
        }
    }
}
