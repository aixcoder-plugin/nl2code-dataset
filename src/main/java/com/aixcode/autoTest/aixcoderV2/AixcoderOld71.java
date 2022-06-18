package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld71 extends GenerateMethodBase {
        public long crc32 ( byte [ ] bytes ) { 
Crc32 crc = new Crc32 ( ) ; 
crc . update ( bytes ) ; 
return crc . getValue ( ) ; 
} 
    }
