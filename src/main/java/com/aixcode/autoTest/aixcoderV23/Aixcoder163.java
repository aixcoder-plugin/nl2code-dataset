package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Aixcoder163 extends GenerateMethodBase {
        public void move (Path src , Path dest ) throws IOException {
if ( Files. isDirectory ( src ) ) {
if ( Files . isDirectory ( dest ) ) { 
dest = dest . resolve ( src . getFileName ( ) ) ; 
} 
try ( DirectoryStream< Path > stream = Files . newDirectoryStream ( src ) ) {
for ( Path entry : stream ) { 
move ( entry , dest . resolve ( src . relativize ( entry ) ) ) ; 
} 
} 
} else { 
Files . move ( src , dest ) ; 
} 
} 
    }
