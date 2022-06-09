package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.io.FileInputStream;

public class AixcoderNew22 extends GenerateMethodBase {
    public String readImageData(String filename)
            throws Exception {
        if (!filename.toLowerCase().endsWith(".jpg")) {
            filename = filename + ".jpg";
        }
        byte[] data = new byte[(int) new File(filename).length()];
        FileInputStream fis = null;
        int r = 0;
        try {
            fis = new FileInputStream(filename);
            r = fis.read(data);
        } finally {
            if (fis != null) {
                fis.close();
            }
        }
        return new String(data, 0, r, "ISO-8859-1");
    }
}
