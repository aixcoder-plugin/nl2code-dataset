package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld40 extends GenerateMethodBase {
    public char getChar(StringBuffer sb, int i) {
        if (i < 0 || i >= sb.length()) {
            throw new RuntimeException("StringIndexOutOfBoundsException");
        }
        return sb.charAt(i);
    }
}
