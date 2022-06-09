package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.lang.reflect.Array;

public class AixcoderNew97 extends GenerateMethodBase {
    public <T> T[] concat(T[] a, T[] b) {
        int aLen = a.length;
        int bLen = b.length;
        @SuppressWarnings("unchecked")
        T[] c = (T[]) Array.newInstance(a.getClass().getComponentType(), aLen + bLen);
        System.arraycopy(a, 0, c, 0, aLen);
        System.arraycopy(b, 0, c, aLen, bLen);
        return c;
    }
}
