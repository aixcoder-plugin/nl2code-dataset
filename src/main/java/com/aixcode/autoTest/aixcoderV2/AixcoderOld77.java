package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AixcoderOld77 extends GenerateMethodBase {
    public FileInputStream openFile(String filename) {
        try {
            return new FileInputStream(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
