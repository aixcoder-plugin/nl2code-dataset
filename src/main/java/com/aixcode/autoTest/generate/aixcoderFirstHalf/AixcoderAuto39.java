package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.io.IOException;

public class AixcoderAuto39 extends GenerateMethodBase {
    /**
     * Generate a not existing temporary file in specified dir
     */
    public String generateTempFile(String dir) {
        try {
            File tempFile = File.createTempFile("tempFileGenerator", ".tmp");
            tempFile.deleteOnExit();
            return tempFile.getAbsolutePath();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
