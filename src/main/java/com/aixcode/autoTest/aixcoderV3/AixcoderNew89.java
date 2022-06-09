package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew89 extends GenerateMethodBase {
    public boolean checkOverflow(int x, int y) {
        if (x < 0)
            x = -x;
        if (y < 0)
            y = -y;
        return x < y ? false : true;
    }
}
