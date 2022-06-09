package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.Reader;

public class GenerateMethod4 extends GenerateMethodBase {
    /**
     * Close Reader. If object is null it is ignored
     */
    public void close(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (Exception e) {
                // ignore
            }
        }
    }
}
