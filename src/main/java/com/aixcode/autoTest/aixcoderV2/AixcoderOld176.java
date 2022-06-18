package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld176 extends GenerateMethodBase {
        public boolean getBinaryState ( int position ) { 
if ( position < 1 || position > 32 ) { 
throw new IllegalArgumentException ( "Position out of bound. Should be between 1 and 32." ) ; 
} 
return ( ( ( value >> ( position -1 ) ) & 0x01 ) == 0x01 ) ; 
} 
    }
