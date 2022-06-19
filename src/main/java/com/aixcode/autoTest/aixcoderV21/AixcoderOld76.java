package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AixcoderOld76 extends GenerateMethodBase {
    public List<String> getClassFileNames(String filepath)
        { 
List < String > fileNames = new ArrayList< String >( ) ;
File file = new File ( filepath ) ;
if ( file . exists ( ) ) { 
//fileNames = getClassFileNames ( file ) ;
} 
return fileNames ; 
} 
    }
