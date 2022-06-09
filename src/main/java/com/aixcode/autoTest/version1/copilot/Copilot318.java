package com.aixcode.autoTest.version1.copilot;

public class Copilot318 {
    /**
     * Compute the CRC32 of an array of bytes.
     */
    public static long crc32(byte[] bytes) {
        long crc = 0xffffffffL;
        for (byte b : bytes) {
            crc = crc32(crc, b);
        }
        return crc;
    }

    /**
     * Compute the CRC32 of a single byte.
     */
    public static long crc32(long crc, byte b) {
        return crc32(crc, b, 0);
    }

    /**
     * Compute the CRC32 of a single byte.
     */
    public static long crc32(long crc, byte b, int index) {
        long c = (crc ^ b) & 0xff;
        for (int i = 0; i < 8; i++) {
            if ((c & 1) != 0) {
                c = (c >>> 1) ^ 0xedb88320L;
            } else {
                c >>>= 1;
            }
        }
        return c;
    }
}
