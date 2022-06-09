package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder380 {
    /**
     * Returns a hash code value for this bit array.
     */
    public int hashCode(byte[] byteArray) {
        int hashCode = 0;

        for (int i = 0; i < byteArray.length; i++) hashCode = 31 * hashCode + byteArray[i];

        return hashCode ^ byteArray.length;
    }
}
