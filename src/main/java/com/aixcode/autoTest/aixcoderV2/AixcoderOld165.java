package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld165 extends GenerateMethodBase {
        public byte [ ] base64decode ( String base64string ) { 
if ( base64string . length ( ) < 1 ) { 
return null ; 
} 
return Base64 . getDecoder ( ) . decode ( base64string ) ; 
} 
    }
