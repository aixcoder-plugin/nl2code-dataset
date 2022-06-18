package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld81 extends GenerateMethodBase {
        public void uploadFile ( String pathname , String filename ) { 
try { 
client . setFileType ( FTPClient . BINARY_FILE_TYPE ) ; 
client . storeFile ( pathname + "/" + filename , new File ( pathname ) ) ; 
System . out . println ( "上传成功" ) ; 
} catch ( IOException e ) { 
e . printStackTrace ( ) ; 
} 
} 
    }
