package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto51 extends GenerateMethodBase {
    /**
     * Returns a hash code value for this bit array.
     */
    public int hashCode(byte[] byteArray) {
        int hashCode = 0;

        for (int i = 0; i < byteArray.length; i++) hashCode = 31 * hashCode + byteArray[i];

        return hashCode ^ byteArray.length;
    }
}
