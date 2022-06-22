package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.*;
import java.util.Collection;

public class AixcoderOld24 extends GenerateMethodBase {
    public void writeFile(Collection<String> lines, File file)
        throws IOException {
if ( file == null ) { 
throw new IOException ( "File is null" ) ; 
} 
if ( ! file . exists ( ) ) { 
file . createNewFile ( ) ; 
} 
FileOutputStream fos = new FileOutputStream ( file ) ;
BufferedOutputStream bos = new BufferedOutputStream ( fos ) ;
PrintWriter writer = new PrintWriter ( bos ) ;
for ( String line : lines ) { 
writer . println ( line ) ; 
} 
writer . close ( ) ; 
} 
    }
