package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld10 extends GenerateMethodBase {
        public List < String > getBackupFiles ( String dir ) { 
List < String > list = new ArrayList < String > ( ) ; 
File [ ] files = new File ( dir ) . listFiles ( ) ; 
if ( files != null ) { 
for ( File file : files ) { 
if ( file . getName ( ) . endsWith ( ".json" ) ) { 
list . add ( file . getName ( ) ) ; 
} 
} 
} 
return list ; 
} 
    }
