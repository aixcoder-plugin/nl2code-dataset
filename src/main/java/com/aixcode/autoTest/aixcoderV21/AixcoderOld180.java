package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderOld180 extends GenerateMethodBase {
    public boolean isBin(String bin) {
        if (bin == null || bin.length() % 8 != 0) {
            return false;
        }
//        for (int i = 0; i < bin.length(); i += 8) {
//            if (!isBinNibble(bin.substring(i, i + 8))) {
//                return false;
//            }
//        }
        return true;
    }
}
