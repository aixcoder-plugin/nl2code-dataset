package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod165 extends GenerateMethodBase {
    /**
     * Decode base64 string to bytes
     */
    public byte[] base64decode(String base64string) {
        return java.util.Base64.getDecoder().decode(base64string);
    }
}
