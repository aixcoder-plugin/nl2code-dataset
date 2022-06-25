package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Aixcoder83 extends GenerateMethodBase {
        public List< String > getFiles (String dir ) {
List < String > list = new ArrayList< String >( ) ;
File file = new File ( dir ) ;
if ( ! file . exists ( ) ) { 
return list ; 
} 
File [ ] files = file . listFiles ( ) ; 
if ( files == null ) { 
return list ; 
} 
for ( File f : files ) { 
if ( f . isFile ( ) ) { 
list . add ( f . getName ( ) ) ; 
} 
} 
return list ; 
} 
    }
