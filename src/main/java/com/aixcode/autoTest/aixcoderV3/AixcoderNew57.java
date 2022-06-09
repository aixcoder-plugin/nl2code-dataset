package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;

public class AixcoderNew57 extends GenerateMethodBase {
    public String joinPath(String path1, String path2) {
//        if (!StringUtils.hasText(path1) && !StringUtils.hasText(path2)) {
//            return "";
//        }
//        if (!StringUtils.hasText(path1)) {
//            return path2;
//        }
//        if (!StringUtils.hasText(path2)) {
//            return path1;
//        }
        if (path1.endsWith(File.pathSeparator) && path2.startsWith(File.pathSeparator)) {
            return path1 + path2.substring(1);
        }
        if (path1.endsWith(File.pathSeparator)) {
            return path1 + path2;
        }
        if (path2.startsWith(File.pathSeparator)) {
            return path1 + path2;
        }
        return path1 + File.pathSeparator + path2;
    }
}
