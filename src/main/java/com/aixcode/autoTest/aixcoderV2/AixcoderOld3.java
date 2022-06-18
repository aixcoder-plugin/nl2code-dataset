package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld3 extends GenerateMethodBase {
        public void writeToFile ( String content , String fileName ) throws IOException { 
if ( fileName == null ) { 
throw new IllegalArgumentException ( "File name can not be null" ) ; 
} 
if ( fileName . isEmpty ( ) ) { 
throw new IllegalArgumentException ( "File name can not be empty" ) ; 
} 
if ( content == null ) { 
throw new IllegalArgumentException ( "File content can not be null" ) ; 
} 
if ( content . isEmpty ( ) ) { 
throw new IllegalArgumentException ( "File content can not be empty" ) ; 
} 
File file = new File ( fileName ) ; 
if ( ! file . exists ( ) ) { 
file . createNewFile ( ) ; 
} 
FileWriter fileWriter = new FileWriter ( file ) ; 
fileWriter . write ( content ) ; 
fileWriter . close ( ) ; 
} 
    }
