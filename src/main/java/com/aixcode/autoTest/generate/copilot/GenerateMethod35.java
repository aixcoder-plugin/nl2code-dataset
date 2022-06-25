package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod35 extends GenerateMethodBase {
    /**
     * Ensure that an object reference passed as a parameter to the calling method is not null.
     */
    public void ensureNotNull(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        }
    }
}
