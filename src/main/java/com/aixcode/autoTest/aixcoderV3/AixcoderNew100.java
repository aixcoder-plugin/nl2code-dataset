package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

public class AixcoderNew100 extends GenerateMethodBase {
    public String canonicalEncodingName(String encoding) {
        if (encoding == null) {
            return null;
        }
        try {
            return Charset.forName(encoding).name();
        } catch (IllegalCharsetNameException icne) {
            return null;
        } catch (UnsupportedCharsetException uce) {
            return null;
        }
    }
}
