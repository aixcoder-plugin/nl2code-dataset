package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AixcoderAuto26 extends GenerateMethodBase {
    /**
     * 获取相应文件filepath的input stream
     */
    public java.io.InputStream getInputStream(String filepath) {
        java.io.InputStream is = null;

        try {
            is = new FileInputStream(filepath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return is;
    }
}
