package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.IOException;
import java.io.OutputStream;

public class GenerateMethod79 extends GenerateMethodBase {
    /**
     * Writes certain bytes from the specified byte array starting from an offset to this output stream.
     */
    public void write(byte[] b, int off, int len, OutputStream outputStream) throws IOException {
        int i = 0;
        while (i < len) {
            int j = 0;
            while (j < len) {
                if (b[j] == '\n') {
                    outputStream.write(b, off, j - i);
                    outputStream.write('\r');
                    outputStream.write('\n');
                    i = j + 1;
                    break;
                }
                j++;
            }
            i++;
        }
    }
}
