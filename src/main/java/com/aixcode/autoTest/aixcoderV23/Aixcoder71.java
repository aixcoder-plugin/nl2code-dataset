package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.zip.CRC32;

public class Aixcoder71 extends GenerateMethodBase {
        public long crc32 ( byte [ ] bytes ) { 
CRC32 crc = new CRC32 ( ) ;
crc . update ( bytes ) ; 
return crc . getValue ( ) ; 
} 
    }
