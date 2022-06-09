package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod111 extends GenerateMethodBase {

    /**
     * Return true if the local path is a Windows absolute path.
     */
    public boolean isWindowsAbsolutePath(String path) {
        return path.matches("^[a-zA-Z]:\\\\.*");
    }
}
