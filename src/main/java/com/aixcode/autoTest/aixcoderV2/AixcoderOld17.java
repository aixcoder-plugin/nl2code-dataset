package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

import java.nio.charset.Charset;
public class AixcoderOld17 extends GenerateMethodBase {
    public Charset charsetForName(String charsetName) {
        if (charsetName == null) {
            return null;
        }
        try {
            return Charset.forName(charsetName);
        } catch (Exception e) {
            return null;
        }
    }
}
