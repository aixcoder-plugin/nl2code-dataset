package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld83 extends GenerateMethodBase {
        public List < String > getFiles ( String dir ) { 
List < String > list = new ArrayList < String > ( ) ; 
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
