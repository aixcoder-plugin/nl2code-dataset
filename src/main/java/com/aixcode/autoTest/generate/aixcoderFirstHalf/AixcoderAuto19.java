package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.HashMap;
import java.util.Map;

public class AixcoderAuto19 extends GenerateMethodBase {
    /**
     * Parses query string to Map from an url.
     */
    public Map<String, String> parseQueryString(String queryString) {
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
