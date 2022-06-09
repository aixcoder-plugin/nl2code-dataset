package com.aixcode.autoTest.version1.aixcoder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Aixcoder103 {
    /**
     * Looks through the backups directory and assembles a list of all json backup files found.
     */
    public List<String> getBackupFiles(String dir) {
        List<String> list = new ArrayList<String>();
        File[] files = new File(dir).listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.getName().endsWith(".json")) {
                    list.add(file.getName());
                }
            }
        }

        return list;
    }
}