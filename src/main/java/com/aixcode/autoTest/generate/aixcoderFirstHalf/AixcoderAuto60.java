package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto60 extends GenerateMethodBase {
    /**
     * 将byte数组转化为16进制字符串
     */
    public String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];

//        for (int j = 0; j < bytes.length; j++) {
//            int v = bytes[j] & 0xFF;
//            hexChars[j * 2] = hexArray[v >>> 4];
//            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
//        }

        //return new String(hexChars);
        return null;
    }
}
