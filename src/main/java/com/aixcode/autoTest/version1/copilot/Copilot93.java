package com.aixcode.autoTest.version1.copilot;

public class Copilot93 {
    /**
     * Create an instance of a clazz using the current thread context ClassLoader.
     */
    public static <T> T newInstance(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
