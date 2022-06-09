package com.aixcode.autoTest.version1.aixcoder;

import java.util.HashMap;
import java.util.Map;

public class Aixcoder271 {
    /**
     * 更新url中的参数(保证参数不重复)
     */
    public static String updateUrl(String url, String key, String value) {
        Map<String, String> map = new HashMap<>();
        map.put(key, value);
        return updateUrlParams(url, map);
    }

    public static String updateUrlParams(String url, Map<String, String> params) {
        if (params == null || params.size() == 0) {
            return url;
        }

        StringBuilder sb = new StringBuilder(url);

        if (url.indexOf("?") == -1) {
            sb.append("?");
        }

        for (Map.Entry<String, String> entry : params.entrySet()) {
            sb.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
        }

        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
