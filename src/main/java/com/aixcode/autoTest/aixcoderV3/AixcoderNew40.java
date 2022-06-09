package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew40 extends GenerateMethodBase {
    public char getChar(StringBuffer sb, int i) {
        int x = i / 4;
        int y = x % 4;
        switch (y) {
            case 0:
                return sb.charAt(i);
            case 1:
                return sb.charAt(x + i + 1);
            case 2:
                return sb.charAt(x + i + 2);
            case 3:
                return sb.charAt(x + i + 3);
        }
        return 0;
    }
}
