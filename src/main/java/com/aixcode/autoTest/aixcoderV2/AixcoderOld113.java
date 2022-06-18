package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld113 extends GenerateMethodBase {
    public String getStringfromStringArray(String[] array) {
        String s = "";
        for (int i = 0; i < array.length; i++) {
            s += array[i] + " ";
        }
        return s;
    }
}
