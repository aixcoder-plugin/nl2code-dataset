package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AixcoderNew26 extends GenerateMethodBase {
    public java.io.InputStream getInputStream(String filepath)
            throws IOException {
        java.io.File file = new java.io.File(filepath);
        if (!file.exists()) {
            throw new FileNotFoundException(filepath + " not found");
        }
        return new FileInputStream(filepath);
    }
}
