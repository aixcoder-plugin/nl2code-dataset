package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class AixcoderOld39 extends GenerateMethodBase {
    public String generateTempFile(String dir) {
        String fileName = UUID.randomUUID().toString();
        File file = new File(dir, fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException("Cannot create temporary file " + fileName, e);
            }
        }
        return file.getAbsolutePath();
    }
}
