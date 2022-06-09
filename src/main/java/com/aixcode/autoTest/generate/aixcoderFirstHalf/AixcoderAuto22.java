package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

public class AixcoderAuto22 extends GenerateMethodBase {
    /**
     * Read the base64 encoded image data from a JPEG image.
     */
    public String readImageData(String filename) throws IOException {
        FileInputStream fis = new FileInputStream(filename);
        byte[] data = new byte[fis.available()];
        fis.read(data);
        fis.close();
        return Base64.getEncoder().encodeToString(data);
    }

}
