package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.security.MessageDigest;

public class GenerateMethod152 extends GenerateMethodBase {
    /**
     *  生成32位的MD5码
     */
    @Override
    public String toMd5Code(String str) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] b = md.digest();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < b.length; i++) {
                sb.append(Integer.toHexString((b[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
        } catch (Exception e) {
//            e.printStackTrace();
        }
        return null;
    }
}
