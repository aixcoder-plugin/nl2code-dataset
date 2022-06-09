package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Map;

public class GenerateMethod44 extends GenerateMethodBase {
    /**
     * 移除 map 中的 null 或者 空字符串
     */
    public void removeNullValue(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() == null || entry.getValue().equals("")) {
                map.remove(entry.getKey());
            }
        }
    }
}
