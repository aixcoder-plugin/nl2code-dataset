package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class AixcoderAuto7 extends GenerateMethodBase {
    /**
     * 从 http 服务拉取配置文件并解析为Properties 对象
     */
    public Properties getProperties(String url) {
        Properties properties = new Properties();

        try {
            URL u = new URL(url);
            InputStream in = u.openStream();

            if (in == null) {
                return null;
            }

            properties.load(in);
            in.close();
        } catch (Exception e) {
//            logger.error("[getProperties] load properties from http server error.url:{}", url, e);
        }

        return properties;
    }
}
