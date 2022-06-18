package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld143 extends GenerateMethodBase {
        public boolean matchesPattern ( String _string , Pattern [ ] _patterns ) { 
for ( Pattern p : _patterns ) { 
if ( p . matcher ( _string ) . matches ( ) ) { 
return true ; 
} 
} 
return false ; 
} 
    }
