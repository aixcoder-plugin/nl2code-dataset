package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.zip.CRC32;

public class AixcoderOld71 extends GenerateMethodBase {
    public long crc32(byte[] bytes)
        {
            CRC32 crc = new CRC32 ( ) ;
crc . update ( bytes ) ; 
return crc . getValue ( ) ; 
} 
    }
