package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;

public class AixcoderNew36 extends GenerateMethodBase {
    public String extractFileName(String path) {
        if (path == null) {
            return null;
        }
        int separatorIndex = path.lastIndexOf(File.pathSeparator);
        return (separatorIndex != -1 ? path.substring(separatorIndex + 1) : path);
    }
}
