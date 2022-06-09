package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder243 {
    /**
     * Ensure that an object reference passed as a parameter to the calling method is not null.
     */
    public static void ensureNotNull(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
    }
}
