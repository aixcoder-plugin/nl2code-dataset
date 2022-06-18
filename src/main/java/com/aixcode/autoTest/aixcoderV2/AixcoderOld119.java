package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

import java.text.DecimalFormat;
public class AixcoderOld119 extends GenerateMethodBase {
    public String formatDouble(double val) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(val);
    }
}
