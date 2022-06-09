package com.aixcode.autoTest.version1.copilot;

import java.io.Reader;

public class Copilot272 {
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
