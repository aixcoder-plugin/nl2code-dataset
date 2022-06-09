package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.IOException;
import java.io.Reader;

public class AixcoderAuto4 extends GenerateMethodBase {
    /**
     * Close Reader. If object is null it is ignored
     */
    public void close(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
            }
        }
    }

}
