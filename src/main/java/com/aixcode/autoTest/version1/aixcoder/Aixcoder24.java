package com.aixcode.autoTest.version1.aixcoder;

import java.io.*;

public class Aixcoder24 {
    /**
     * Reads up to len bytes of data from this input stream into an array of bytes
     */
    public static byte[] readBytes(InputStream in, int len) throws IOException {
        if (len <= 0) {
            return null;
        }

        byte[] b = new byte[len];
        int read = 0;
        int offset = 0;

        while (offset < len && (read = in.read(b, offset, len - offset)) != -1) {
            offset += read;
        }

        if (offset != len) {
            throw new IOException("Expected" + len + "bytes,read" + offset + "bytes");
        }

        return b;
    }


}
