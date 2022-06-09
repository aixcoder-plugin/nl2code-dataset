package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew82 extends GenerateMethodBase {
    public String diff(java.util.Map<String, String> map1, java.util.Map<String, String> map2) {
        if (map1 == null && map2 == null) {
            return "";
        }
        if (map1 == null) {
            return map2.toString();
        }
        if (map2 == null) {
            return map1.toString();
        }
//        java.util.Map<String, String> tempMap = new java.util.HashMap<String, String>();
//        for (String key : map2.keySet()) {
//            if (!map1.containsKey(key)) {
//                tempMap.put(key, map2.get(key));
//            }
//        }
//        for (String key : map1.keySet()) {
//            if (!map2.containsKey(key)) {
//                tempMap.put(key, map1.get(key));
//            }
//        }
//        return diffMap(map1, tempMap);
        return null;
    }
}
