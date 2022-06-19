package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld107 extends GenerateMethodBase {
    public boolean checkNotNullOrEmpty(int[] array) {
        if (array == null) {
            return false;
        }
        return array.length != 0;
    }
}
