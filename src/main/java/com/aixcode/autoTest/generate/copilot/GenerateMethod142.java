package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod142 extends GenerateMethodBase {
    /**
     * 获取url的顶级域名
     */
    public String getTopDomain(String url) {
        if (url == null) {
            return null;
        }
        int index = url.indexOf("://");
        if (index != -1) {
            url = url.substring(index + 3);
        }
        index = url.indexOf("/");
        if (index != -1) {
            url = url.substring(0, index);
        }
        index = url.indexOf(":");
        if (index != -1) {
            url = url.substring(0, index);
        }
        index = url.indexOf("?");
        if (index != -1) {
            url = url.substring(0, index);
        }
        index = url.indexOf("#");
        if (index != -1) {
            url = url.substring(0, index);
        }
        index = url.indexOf(".");
        if (index != -1) {
            url = url.substring(index + 1);
        }
        return url;
    }
}
