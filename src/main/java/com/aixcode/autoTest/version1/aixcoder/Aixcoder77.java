package com.aixcode.autoTest.version1.aixcoder;

import java.util.Arrays;

public class Aixcoder77 {
    public static<T> T[] concat(T[] a, T[] b) {
        T[] c = Arrays.copyOf(a, a.length + b.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        return c;
    }
}
