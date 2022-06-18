package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderOld18 extends GenerateMethodBase {
    public byte[] readBytes(java.io.InputStream in, int len) throws java.io.IOException {
        if (in == null)
            return null;
        int i = 0;
        int available = len;
        if (available < len) {
            len = available;
        }
        byte[] buf = new byte[len];
        if (len > 0) {
            i = in.read(buf, 0, available);
        }
        return buf;
    }
}
