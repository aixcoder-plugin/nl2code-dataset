package com.aixcode.autoTest.version1.aixcoder;

import java.util.HashMap;
import java.util.Map;

public class Aixcoder307 {
    /**
     * Parses query string to Map from an url.
     */
    public static Map<String, String> parseQueryString(String queryString) {
        Map<String, String> map = new HashMap<>();

        if (queryString != null) {
            String[] parameters = queryString.split("&");

            for (String parameter : parameters) {
                String[] keyValue = parameter.split("=");
                map.put(keyValue[0], keyValue.length == 2 ? keyValue[1] : null);
            }
        }

        return map;
    }
}
