package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;

public class AixcoderOld114 extends GenerateMethodBase {
    public boolean isValidZip(File zip)
        { 
ZipFile zipFile = null ;
try { 
zipFile = new ZipFile ( zip ) ; 
} catch ( IOException e ) {
return false ; 
} finally { 
if ( zipFile != null ) { 
try { 
zipFile . close ( ) ; 
} catch ( IOException e ) { 
// ignore
} 
} 
} 
return true ; 
} 
    }
