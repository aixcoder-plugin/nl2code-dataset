package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod51 extends GenerateMethodBase {
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
