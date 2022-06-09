package com.aixcode.autoTest.version1.copilot;

public class Copilot243 {
    /**
     * Ensure that an object reference passed as a parameter to the calling method is not null.
     */
    public static void ensureNotNull(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        }
    }
}
