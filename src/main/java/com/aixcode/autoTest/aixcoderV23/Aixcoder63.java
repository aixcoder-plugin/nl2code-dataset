package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder63 extends GenerateMethodBase {
        public boolean checkUsername ( String username ) { 
if ( username . length ( ) > 20 ) { 
return false ; 
} 
if ( username . length ( ) < 4 || username . length ( ) > 10 ) { 
return false ; 
} 
if ( ! username . matches ( "[a-zA-Z0-9_]+" ) ) { 
return false ; 
} 
return true ; 
} 
    }
