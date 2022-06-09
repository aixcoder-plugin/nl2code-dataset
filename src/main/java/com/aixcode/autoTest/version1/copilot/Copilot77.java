package com.aixcode.autoTest.version1.copilot;

public class Copilot77 {
    /**
     * Concatenate two arrays of T type
     */
    public static <T> T[] concat(T[] a, T[] b) {
        T[] result = (T[]) new Object[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }
}
