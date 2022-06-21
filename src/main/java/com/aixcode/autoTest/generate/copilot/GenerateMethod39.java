package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod39 extends GenerateMethodBase {
    /**
     * Generate a not existing temporary file in specified dir
     */
    public String generateTempFile(String dir) {
        String fileName = "";
        try {
            fileName = java.io.File.createTempFile("temp", ".tmp", new java.io.File(dir)).getAbsolutePath();
        } catch (java.io.IOException e) {
//            e.printStackTrace();
        }
        return fileName;
    }
}
