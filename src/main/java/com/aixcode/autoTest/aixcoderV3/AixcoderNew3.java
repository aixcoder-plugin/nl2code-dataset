package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AixcoderNew3 extends GenerateMethodBase {
    public void writeToFile(String content, String fileName)
            throws IOException {
        String fullPath = fileName;
        File dir = new File(fullPath.substring(0, fullPath.lastIndexOf("/")));
        if (!dir.exists()) {
            dir.mkdirs();
        }
        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter(fullPath);
            bw = new BufferedWriter(fw);
            bw.write(content);
        } catch (IOException e) {
            throw (e);
        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
            }
        }
    }
}
