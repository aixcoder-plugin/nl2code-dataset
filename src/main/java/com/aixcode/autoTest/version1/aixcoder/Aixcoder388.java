package com.aixcode.autoTest.version1.aixcoder;

import java.io.File;

public class Aixcoder388 {
    public static String joinPath(String path1, String path2) {
        if (path1.endsWith(File.separator) == false && path2.endsWith(File.separator) == false) {
            return path1 + path2;
        } else if (path1.endsWith(File.separator)) {
            return path1 + path2.substring(0, path2.length() - 1);
        } else if (path2.endsWith(File.separator)) {
            return path1 + path2.substring(0, path2.length() - 1);
        } else {
            return path1 + File.separator + path2;
        }
    }
}
