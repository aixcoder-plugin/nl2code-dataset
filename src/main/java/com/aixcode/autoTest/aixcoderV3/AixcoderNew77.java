package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AixcoderNew77 extends GenerateMethodBase {
    public FileInputStream openFile(String filename) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fis;
    }
}
