package com.aixcode.autoTest.version1.aixcoder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Aixcoder7 {
    /**
     * 获取相应文件filepath的input stream
     */
    public static java.io.InputStream getInputStream(String filepath) {
        java.io.InputStream is = null;

        try {
            is = new FileInputStream(filepath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return is;
    }
}
