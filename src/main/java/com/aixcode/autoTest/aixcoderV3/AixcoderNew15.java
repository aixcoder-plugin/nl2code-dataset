package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.*;

public class AixcoderNew15 extends GenerateMethodBase {
    public void copyFile(String sourcePath, String destPath)
            throws IOException {
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            int byteRead;
            File srcFile = new File(sourcePath);
            if (srcFile.exists()) {
// file exists
// read the source file
                inputStream = new FileInputStream(sourcePath);
                fileOutputStream = new FileOutputStream(destPath);
                byte[] buffer = new byte[1444];
                while ((byteRead = inputStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, byteRead);
                }
            }
        } finally {
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}
