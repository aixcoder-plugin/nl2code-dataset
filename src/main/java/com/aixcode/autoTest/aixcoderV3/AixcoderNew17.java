package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.nio.charset.Charset;

public class AixcoderNew17 extends GenerateMethodBase {
    public Charset charsetForName(String charsetName) {
        try {
            return Charset.forName(charsetName);
        } catch (Exception e) {
            return Charset.defaultCharset();
        }
    }
}
