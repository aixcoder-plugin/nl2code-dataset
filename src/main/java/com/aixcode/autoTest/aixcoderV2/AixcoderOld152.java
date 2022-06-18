package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld152 extends GenerateMethodBase {
        public String toMd5Code ( String str ) { 
String base = str + "/" + slat ; 
String md5 = DigestUtils . md5DigestAsHex ( base . getBytes ( ) ) ; 
return md5 ; 
} 
    }
