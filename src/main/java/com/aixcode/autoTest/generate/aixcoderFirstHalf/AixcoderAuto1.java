package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto1 extends GenerateMethodBase {
    /**
     * Creates a padding string of a certain length
     */
    public String createPadding(int length, char padChar) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < length; i++) {
            sb.append(padChar);
        }

        return sb.toString();
    }
}
