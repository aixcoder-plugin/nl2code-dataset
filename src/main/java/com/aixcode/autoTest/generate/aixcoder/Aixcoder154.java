package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.net.URL;

public class Aixcoder154 extends GenerateMethodBase {

    public URL getUrlFile(String fileName) {
        if (fileName == null) {
            return null;
        }

        return this.getClass().getClassLoader().getResource(fileName);
    }
}
