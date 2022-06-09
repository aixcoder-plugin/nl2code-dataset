package com.aixcode.autoTest.version1.copilot;

public class Copilot338 {
    /**
     * Generate a not existing temporary file in specified dir
     */
    public static String generateTempFile(String dir) {
        String fileName = "";
        try {
            fileName = java.io.File.createTempFile("temp", ".tmp", new java.io.File(dir)).getAbsolutePath();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return fileName;
    }
}
