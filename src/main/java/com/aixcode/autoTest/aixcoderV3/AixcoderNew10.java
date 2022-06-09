package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AixcoderNew10 extends GenerateMethodBase {
    public List<String> getBackupFiles(String dir) {
        List<String> files = new ArrayList<>();
        File[] filesOrDirs = new File(dir).listFiles();
        if (filesOrDirs == null) {
            return files;
        }
        for (File fileOrDir : filesOrDirs) {
            if (fileOrDir.isDirectory()) {
                files.addAll(getBackupFiles(fileOrDir.getAbsolutePath()));
            } else {
                files.add(fileOrDir.getAbsolutePath());
            }
        }
        return files;
    }
}
