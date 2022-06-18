package com.aixcode.autoTest.aixcoderV2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld152 extends GenerateMethodBase {
    public String toMd5Code(String s) {
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
