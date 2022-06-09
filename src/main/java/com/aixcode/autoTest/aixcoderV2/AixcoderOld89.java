package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderOld89 extends GenerateMethodBase {
    public boolean checkOverflow(int x, int y) {
        if (x > y) {
// check for overflow
            if (x < 0)
                return true;
            else
                return false;
        } else {
// check for overflow
            if (y < 0)
                return true;
            else
                return false;
        }
    }
}
