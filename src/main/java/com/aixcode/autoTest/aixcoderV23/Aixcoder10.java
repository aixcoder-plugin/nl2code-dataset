package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Aixcoder10 extends GenerateMethodBase {
        public List< String > getBackupFiles (String dir ) {
List < String > list = new ArrayList< String >( ) ;
File[ ] files = new File ( dir ) . listFiles ( ) ;
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
