package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld114 extends GenerateMethodBase {
        public boolean isValidZip ( File zip ) { 
try { 
ZipFile zipFile = new ZipFile ( zip ) ; 
zipFile . close ( ) ; 
return true ; 
} catch ( IOException e ) { 
return false ; 
} 
} 
    }
