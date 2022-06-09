package com.aixcode.autoTest.version1.copilot;

public class Copilot271 {
    /**
     * 更新url中的参数(保证参数不重复)
     */
    public static String updateUrl(String url, String key, String value) {
        if (url.contains("?")) {
            url += "&";
        } else {
            url += "?";
        }
        url += key + "=" + value;
        return url;
    }
}
