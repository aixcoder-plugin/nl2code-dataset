package com.aixcode.autoTest.version1.copilot;

public class Copilot300 {
    /**
     * Extract the filename from the given path.
     */
    public static String extractFileName(String path) {
        return path.substring(path.lastIndexOf("/") + 1);
    }
}
