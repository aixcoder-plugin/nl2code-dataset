package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod36 extends GenerateMethodBase {
    /**
     * Extract the filename from the given path.
     */
    public String extractFileName(String path) {
        return path.substring(path.lastIndexOf("/") + 1);
    }
}
