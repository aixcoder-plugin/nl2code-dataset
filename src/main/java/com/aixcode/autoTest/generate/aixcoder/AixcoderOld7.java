package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class AixcoderOld7 extends GenerateMethodBase {
    public Properties getProperties(String url) {
        Properties properties = new Properties();
        try {
            properties.load(new URL(url).openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
