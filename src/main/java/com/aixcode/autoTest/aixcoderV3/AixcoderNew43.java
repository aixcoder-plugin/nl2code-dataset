package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew43 extends GenerateMethodBase {
    public String updateUrl(String url, String key, String value) {
// 获取分割符
        String separator = "&";
// 获取参数
        String params = url.substring(url.indexOf("?") + 1);
// 判断是否存在参数
        if (params.indexOf("&") > 0) {
// 获取参数
            String[] paramList = params.split(separator);
// 获取参数中的key
            String paramKey = paramList[0].substring(paramList[0].indexOf("=") + 1);
// 判断key是否存在
            if (key != null && !"".equals(key)) {
// 判断key是否和目标参数中key一致
                if (paramKey.equals(key)) {
// 如果是KL,且value值一样
                    if (value.equals("K")) {
// 替换value值
                        params = params.replace(paramKey, "");
                    }
                }
            }
        }
// 拼接新的参数
        url = url.replace(params, separator + key + separator + value);
        return url;
    }
}
