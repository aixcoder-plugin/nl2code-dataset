package com.aixcode.autoTest.version1.aixcoder;

import java.io.File;
import java.io.IOException;

public class Aixcoder338 {
    /**
     * Generate a not existing temporary file in specified dir
     */
    public static String generateTempFile(String dir) {
        try {
            File tempFile = File.createTempFile("tempFileGenerator", ".tmp");
            tempFile.deleteOnExit();
            return tempFile.getAbsolutePath();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
