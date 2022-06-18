package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld15 extends GenerateMethodBase {
        public void copyFile ( String sourcePath , String destPath ) throws IOException { 
Path source = Paths . get ( sourcePath ) ; 
Path dest = Paths . get ( destPath ) ; 
Files . copy ( source , dest , StandardCopyOption . REPLACE_EXISTING ) ; 
} 
    }
