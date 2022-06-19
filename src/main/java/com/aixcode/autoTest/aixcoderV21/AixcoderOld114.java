package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;

public class AixcoderOld114 extends GenerateMethodBase {
    public boolean isValidZip(File zip)
        { 
try { 
ZipFile zipFile = new ZipFile ( zip ) ;
zipFile . close ( ) ; 
return true ; 
} catch ( IOException e ) {
return false ; 
} 
} 
    }
