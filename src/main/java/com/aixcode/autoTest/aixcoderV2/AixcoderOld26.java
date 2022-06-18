package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld26 extends GenerateMethodBase {
        public java . io . InputStream getInputStream ( String filepath ) { 
java . io . InputStream is = null ; 
try { 
is = new FileInputStream ( filepath ) ; 
} catch ( FileNotFoundException e ) { 
e . printStackTrace ( ) ; 
} 
return is ; 
} 
    }
