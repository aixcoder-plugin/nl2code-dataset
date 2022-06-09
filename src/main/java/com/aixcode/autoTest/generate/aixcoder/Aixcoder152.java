package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Aixcoder152 extends GenerateMethodBase {
    /**
     *  生成32位的MD5码
     */
    @Override
    public String toMd5Code(String s) throws NoSuchAlgorithmException {
        String str = "";

        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(s.getBytes());
            byte[] b = md5.digest();
            int i;
            StringBuffer buf = new StringBuffer("");

            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];

                if (i < 0)
                    i += 256;

                if (i < 16)
                    buf.append("0");

                buf.append(Integer.toHexString(i));
            }

            str = buf.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return str;
    }
}
