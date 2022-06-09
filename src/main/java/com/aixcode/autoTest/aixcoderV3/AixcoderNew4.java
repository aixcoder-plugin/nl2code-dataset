package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.IOException;
import java.io.Reader;

public class AixcoderNew4 extends GenerateMethodBase {
    public void close(Reader reader)
            throws IOException {
        if (reader != null)
            reader.close();
    }
}
