package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;


public class AixcoderOld111 extends GenerateMethodBase {
    public boolean isWindowsAbsolutePath(String path)
        { 
//if ( ! isAbsolutePath ( path ) )
//return false ;
// On Windows, an absolute path starts with "[drive_letter]:\".
if ( path . length ( ) > 2 && path . charAt ( 1 ) == ':' && Character . isLetter ( path . charAt ( 0 ) ) && ( path . charAt ( 2 ) == '\\' || path . charAt ( 2 ) == '/' ) ) 
return true ; 
else 
return false ; 
} 
    }
