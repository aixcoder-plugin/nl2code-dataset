package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld6 extends GenerateMethodBase {
        public void putShort ( byte [ ] data , short value , int offset ) { 
data [ offset ] = ( byte ) ( ( value >>> 8 ) & 0xFF ) ; 
data [ offset + 1 ] = ( byte ) ( ( value ) & 0xFF ) ; 
} 
    }
