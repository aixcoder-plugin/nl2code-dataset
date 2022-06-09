package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.zip.CRC32;

public class AixcoderAuto71 extends GenerateMethodBase {
    public long crc32(byte[] bytes) {
//        Crc32 crc = new Crc32();
        // 预测的是上面注释的那一行，大小写不对
        CRC32 crc = new CRC32();
        crc.update(bytes);
        return crc.getValue();
    }
}
