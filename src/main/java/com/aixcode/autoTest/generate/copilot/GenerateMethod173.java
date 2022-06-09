package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;

public class GenerateMethod173 extends GenerateMethodBase {
    /**
     * Get the extension of a file. Return a null string if there is no extension.
     */
    public String getFileExtension(File file) {
        String fileName = file.getName();
        if (fileName.lastIndexOf(".") == -1) {
            return null;
        } else {
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        }
    }
}
