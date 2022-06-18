package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld169 extends GenerateMethodBase {
        public long remaining ( ByteBuffer [ ] buffers ) { 
long result = 0 ; 
for ( ByteBuffer buffer : buffers ) { 
result += buffer . remaining ( ) ; 
} 
return result ; 
} 
    }
