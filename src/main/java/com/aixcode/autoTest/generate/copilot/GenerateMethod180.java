package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod180 extends GenerateMethodBase {
    /**
     *  Check if a string is binary, which is composed of 0/1, and string length is multiple of 8.
     */
    @Override
    public boolean isBin(String bin) {
        if (bin.length() % 8 != 0) {
            return false;
        }
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) != '0' && bin.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }
}
