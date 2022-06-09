package com.aixcode.autoTest.version1.aixcoder;

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

public class Aixcoder298 {
    public static String canonicalEncodingName(String encoding) {
        if (encoding == null) {
            return null;
        }

        try {
            return Charset.forName(encoding).name();
        } catch (IllegalCharsetNameException icne) {
            return encoding;
        } catch (UnsupportedCharsetException uce) {
            return encoding;
        }
    }
}
