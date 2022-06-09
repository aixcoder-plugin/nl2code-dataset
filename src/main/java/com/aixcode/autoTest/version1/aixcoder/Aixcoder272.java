package com.aixcode.autoTest.version1.aixcoder;

import java.io.IOException;
import java.io.Reader;

public class Aixcoder272 {
    /**
     * Close Reader. If object is null it is ignored
     */
    public static void close(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
            }
        }
    }

}
