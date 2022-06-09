package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.util.UUID;

public class AixcoderNew39 extends GenerateMethodBase {
    public String generateTempFile(String dir) {
        String name = "tmp_" + UUID.randomUUID().toString();
        File file = new File(dir, name);
        while (file.exists()) {
            name = "tmp_" + UUID.randomUUID().toString();
            file = new File(dir, name);
        }
        return file.getAbsolutePath();
    }
}
