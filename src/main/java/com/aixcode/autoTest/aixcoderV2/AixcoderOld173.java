package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld173 extends GenerateMethodBase {
        public String getFileExtension ( File file ) { 
String filename = file . getName ( ) ; 
int i = filename . lastIndexOf ( '.' ) ; 
if ( i > 0 && i < filename . length ( ) -1 ) { 
return filename . substring ( i + 1 ) . toLowerCase ( ) ; 
} else { 
return null ; 
} 
} 
    }
