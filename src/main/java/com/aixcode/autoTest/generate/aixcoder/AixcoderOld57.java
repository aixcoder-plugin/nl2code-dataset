package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;

public class AixcoderOld57 extends GenerateMethodBase {
    public String joinPath(String path1, String path2)
        { 
if ( path1 . endsWith ( File. separator ) == false && path2 . endsWith ( File . separator ) == false ) {
return path1 + path2 ; 
} else if ( path1 . endsWith ( File . separator ) ) { 
return path1 + path2 . substring ( 0 , path2 . length ( ) -1 ) ; 
} else if ( path2 . endsWith ( File . separator ) ) { 
return path1 + path2 . substring ( 0 , path2 . length ( ) -1 ) ; 
} else { 
return path1 + File . separator + path2 ; 
} 
} 
    }
