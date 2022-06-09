package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class AixcoderAuto17 extends GenerateMethodBase {
    /**
     * Parses character set name to Charset object
     */
    public Charset charsetForName(String charsetName) {
        if (charsetName == null) {
            return null;
        }

        charsetName = charsetName.trim();

        if (charsetName.equalsIgnoreCase("UTF-8")) {
            return StandardCharsets.UTF_8;
        } else if (charsetName.equalsIgnoreCase("US-ASCII")) {
            return StandardCharsets.US_ASCII;
        } else if (charsetName.equalsIgnoreCase("ISO-8859-1")) {
            return StandardCharsets.ISO_8859_1;
        } else if (charsetName.equalsIgnoreCase("ISO-8859-8")) {
            return null;
        }
        return null;
    }
}
