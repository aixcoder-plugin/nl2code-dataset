package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto35 extends GenerateMethodBase {
    /**
     * Ensure that an object reference passed as a parameter to the calling method is not null.
     */
    public void ensureNotNull(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
    }
}
