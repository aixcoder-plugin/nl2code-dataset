package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.security.MessageDigest;

public class Aixcoder153 extends GenerateMethodBase {
    /**
     *  计算 C2 = M xor t
     */
//    @Override
    public byte[] calculateC21(byte[] M, byte[] t) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(M);
        md.update(t);
        return md.digest();
    }


}
