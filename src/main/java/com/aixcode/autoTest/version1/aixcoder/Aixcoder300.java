package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder300 {
    public static String extractFileName(String path) {
        int lastSlashIndex = path.lastIndexOf('/');

        if (lastSlashIndex == -1) {
            lastSlashIndex = path.lastIndexOf('\\');
        }

        return (lastSlashIndex != -1 ? path.substring(lastSlashIndex + 1) : path);
    }
}
