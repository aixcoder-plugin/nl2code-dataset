package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.HashMap;
import java.util.Map;

public class AixcoderNew19 extends GenerateMethodBase {
    public Map<String, String> parseQueryString(String queryString) {
        if (queryString == null || queryString.isEmpty()) {
            return new HashMap<String, String>();
        }
        Map<String, String> res = new HashMap<String, String>();
        String[] pairs = queryString.split("&");
        for (String pair : pairs) {
            String[] parts = pair.split("=", 2);
            if (parts.length == 2) {
                res.put(parts[0], parts[1]);
            }
        }
        return res;
    }
}
