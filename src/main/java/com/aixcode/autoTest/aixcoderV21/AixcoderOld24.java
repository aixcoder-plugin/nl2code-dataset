package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

public class AixcoderOld24 extends GenerateMethodBase {
    public void writeFile(Collection<String> lines, File file)
        throws IOException {
if ( file == null ) { 
throw new IOException ( "File is null" ) ; 
} 
if ( file . isDirectory ( ) ) { 
throw new IOException ( "File is a directory" ) ; 
} 
if ( ! file . getParentFile ( ) . exists ( ) ) { 
file . getParentFile ( ) . mkdirs ( ) ; 
} 
if ( ! file . exists ( ) ) { 
file . createNewFile ( ) ; 
} 
try ( FileWriter fw = new FileWriter ( file ) ) {
for ( String line : lines ) { 
fw . write ( line ) ; 
fw . write ( "\n" ) ; 
} 
} 
} 
    }
