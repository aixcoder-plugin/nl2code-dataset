package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod43 extends GenerateMethodBase {
    /**
     * 更新url中的参数(保证参数不重复)
     */
    public String updateUrl(String url, String key, String value) {
        if (url.contains("?")) {
            url += "&";
        } else {
            url += "?";
        }
        url += key + "=" + value;
        return url;
    }
}
