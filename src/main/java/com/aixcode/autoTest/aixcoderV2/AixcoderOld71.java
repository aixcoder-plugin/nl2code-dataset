package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import java.util.zip.CRC32;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld71 extends GenerateMethodBase {
        public long crc32 ( byte [ ] bytes ) {
            CRC32 crc = new CRC32 ( ) ;
crc . update ( bytes ) ; 
return crc . getValue ( ) ; 
} 
    }
