package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderOld176 extends GenerateMethodBase {
    public boolean getBinaryState(int targetInteger, int position) {
        int value = targetInteger;
        return (value & (1 << position)) > 0;
    }
}
