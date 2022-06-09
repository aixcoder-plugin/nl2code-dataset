package com.aixcode.autoTest.version1.copilot;

public class Copilot380 {
    /**
     * Returns a hash code value for this bit array.
     */
    public int hashCode(byte[] byteArray) {
        int hash = 0;
        for (int i = 0; i < byteArray.length; i++) {
            hash = 31 * hash + byteArray[i];
        }
        return hash;
    }
}
