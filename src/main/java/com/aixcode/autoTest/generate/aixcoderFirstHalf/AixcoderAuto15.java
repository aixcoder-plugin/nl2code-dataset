package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.*;

public class AixcoderAuto15 extends GenerateMethodBase {
    /**
     * Copy a file from source path to destination path
     */
    public void copyFile(String sourcePath, String destPath) throws IOException {
        if (sourcePath == null || destPath == null) {
            throw new NullPointerException("Null path");
        }

        if (!new File(sourcePath).exists()) {
            throw new IllegalArgumentException("File does not exist:" + sourcePath);
        }

        if (!new File(destPath).exists()) {
            throw new IllegalArgumentException("File does not exist:" + destPath);
        }

        if (!new File(destPath).getParentFile().exists()) {
            throw new IllegalArgumentException("Parent folder does not exist:" + destPath);
        }

        if (!new File(destPath).getParentFile().canWrite()) {
            throw new IllegalArgumentException("Parent folder is not writable:" + destPath);
        }

        if (!new File(destPath).canWrite()) {
            throw new IllegalArgumentException("File is not writable:" + destPath);
        }

        try(FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(destPath)) {
            byte[] buf = new byte[1024];
            int i;

            while ((i = fis.read(buf)) != -1) {
                fos.write(buf, 0, i);
            }
        }
    }
}
