package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder142 extends GenerateMethodBase {
    public String getTopDomain(String url) {
        if (url.contains(".")) {
            return url.substring(0, url.lastIndexOf("."));
        }

        return url;
    }
}
