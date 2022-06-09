package com.aixcode.autoTest.version1.copilot;

public class Copilot393 {
    /**
     * convert byte array to a hex string
     */
    public static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
