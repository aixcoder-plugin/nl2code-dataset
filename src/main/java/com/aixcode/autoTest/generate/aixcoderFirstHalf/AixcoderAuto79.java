package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class AixcoderAuto79 extends GenerateMethodBase {
    public void write(byte[] b, int off, int len, OutputStream outputStream) throws IOException {
        if (b == null) {
            throw new NullPointerException();
        } else if ((off < 0) || (off > b.length) || (len < 0) || ((off + len) > b.length) || ((off + len) < 0)) {
            throw new IndexOutOfBoundsException();
        } else if (len == 0) {
            return;
        }
        int count=0;
        int newcount = count + len;

        if (newcount > b.length) {
            b = Arrays.copyOf(b, Math.max(b.length << 1, newcount));
        }

        System.arraycopy(b, off, b, count, len);
        count = newcount;
    }
}
