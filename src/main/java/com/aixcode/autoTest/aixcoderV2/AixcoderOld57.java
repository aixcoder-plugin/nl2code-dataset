package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld57 extends GenerateMethodBase {
        public String joinPath ( String path1 , String path2 ) { 
if ( path1 . endsWith ( "/" ) && path2 . startsWith ( "/" ) ) { 
return path1 + path2 . substring ( 1 ) ; 
} else if ( path1 . endsWith ( "/" ) ) { 
return path1 + path2 ; 
} else if ( path2 . startsWith ( "/" ) ) { 
return path1 + path2 ; 
} else { 
return path1 + "/" + path2 ; 
} 
} 
    }
