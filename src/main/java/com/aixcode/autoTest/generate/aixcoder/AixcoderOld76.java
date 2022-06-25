package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AixcoderOld76 extends GenerateMethodBase {
    public List<String> getClassFileNames(String filepath)
        { 
File file = new File ( filepath ) ;
List < String > list = new ArrayList< String >( ) ;
if ( file . exists ( ) ) { 
File [ ] listFiles = file . listFiles ( ) ; 
for ( File listFile : listFiles ) { 
if ( listFile . isDirectory ( ) ) { 
list . addAll ( getClassFileNames ( listFile . getPath ( ) ) ) ; 
} else { 
String filename = listFile . getName ( ) ; 
if ( filename . endsWith ( ".class" ) ) { 
list . add ( filename ) ; 
} 
} 
} 
} 
return list ; 
} 
    }
