package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class AixcoderOld144 extends GenerateMethodBase {
    public void extractAll(String destPath, String zipName)
        throws IOException {
File zipFile = new File( zipName ) ;
if ( zipFile . exists ( ) ) { 
if ( zipFile . isDirectory ( ) ) { 
String [ ] files = zipFile . list ( ) ; 
for ( String file : files ) { 
String destFile = destPath + File . separator + file ; 
extractAll ( destFile , zipName ) ; 
} 
} else { 
if ( ! destPath . endsWith ( File . separator ) ) { 
destPath += File . separator ; 
} 
destPath += zipName ; 
try (FileInputStream fis = new FileInputStream ( zipFile );
     ZipInputStream zis = new ZipInputStream ( fis ) ) {
ZipEntry entry ;
while ( ( entry = zis . getNextEntry ( ) ) != null ) { 
String filename = entry . getName ( ) ; 
if ( ! filename . startsWith ( destPath ) ) { 
throw new IOException ( "Entry is outside of the target directory: " + filename ) ; 
} 
if ( entry . isDirectory ( ) ) { 
String dirName = filename . substring ( destPath . length ( ) ) ; 
dirName = ( dirName . endsWith ( File . separator ) ) ? dirName : dirName + File . separator ; 
File dir = new File ( destPath + dirName ) ; 
if ( ! dir . exists ( ) ) { 
dir . mkdirs ( ) ; 
} 
} else { 
File file = new File ( destPath + filename ) ; 
if ( ! file . getParentFile ( ) . exists ( ) ) { 
file . getParentFile ( ) . mkdirs ( ) ; 
} 
try ( FileOutputStream fos = new FileOutputStream ( file ) ) {
byte [ ] buffer = new byte [ 1024 ] ; 
int read ; 
while ( ( read = zis . read ( buffer ) ) != -1 ) { 
fos . write ( buffer , 0 , read ) ; 
} 
} 
} 
} 
} 
} 
} else { 
throw new IOException ( "Zip file does not exist: " + zipName ) ; 
} 
} 
    }
