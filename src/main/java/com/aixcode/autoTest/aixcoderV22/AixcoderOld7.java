package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class AixcoderOld7 extends GenerateMethodBase {
    public Properties getProperties(String url) {
        Properties properties = new Properties();
        try {
            InputStream in = new FileInputStream(url);
            if (in == null) {
                return null;
            }
            properties.load(in);
            in.close();
        } catch (Exception e) {
        }
        return properties;
    }
}
