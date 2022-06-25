package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod100 extends GenerateMethodBase {
    /**
     * Convert an arbitrary text encoding to its canonical name
     */
    public String canonicalEncodingName(String encoding) {
        if (encoding == null) {
            return null;
        }

        if (encoding.equalsIgnoreCase("ASCII")) {
            return "US-ASCII";
        } else if (encoding.equalsIgnoreCase("ANSI")) {
            return "US-ASCII";
        } else if (encoding.equalsIgnoreCase("UTF-8")) {
            return "UTF-8";
        } else if (encoding.equalsIgnoreCase("UTF-16")) {
            return "UTF-16";
        } else if (encoding.equalsIgnoreCase("UTF-16BE")) {
            return "UTF-16BE";
        } else if (encoding.equalsIgnoreCase("UTF-16LE")) {
            return "UTF-16LE";
        } else if (encoding.equalsIgnoreCase("UTF-32")) {
            return "UTF-32";
        } else if (encoding.equalsIgnoreCase("UTF-32BE")) {
            return "UTF-32BE";
        } else if (encoding.equalsIgnoreCase("UTF-32LE")) {
            return "UTF-32LE";
        } else {
            return encoding;
        }
    }
}
