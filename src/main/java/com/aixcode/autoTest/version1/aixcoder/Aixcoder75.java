package com.aixcode.autoTest.version1.aixcoder;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

public class Aixcoder75 {
    /**
     * Read the base64 encoded image data from a JPEG image.
     */
    public static String readImageData(String filename) throws IOException {
        FileInputStream fis = new FileInputStream(filename);
        byte[] data = new byte[fis.available()];
        fis.read(data);
        fis.close();
        return Base64.getEncoder().encodeToString(data);
    }

}
