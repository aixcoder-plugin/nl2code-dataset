package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;

public class Aixcoder57 extends GenerateMethodBase {
        public String joinPath ( String path1 , String path2 ) { 
boolean path1EndsWithSeparator = path1 . endsWith ( File. separator ) ;
boolean path2EndsWithSeparator = path2 . endsWith ( File . separator ) ; 
if ( path1EndsWithSeparator && path2EndsWithSeparator ) { 
return path1 + path2 . substring ( 0 , path2 . length ( ) -1 ) ; 
} else if ( path1EndsWithSeparator || path2EndsWithSeparator ) { 
return path1 + path2 ; 
} else { 
return path1 + File . separator + path2 ; 
} 
} 
    }
