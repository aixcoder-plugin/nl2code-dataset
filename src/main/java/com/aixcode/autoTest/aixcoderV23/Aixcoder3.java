package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aixcoder3 extends GenerateMethodBase {
        public void writeToFile ( String content , String fileName ) throws IOException {
try (FileWriter fw = new FileWriter ( fileName );
     BufferedWriter bw = new BufferedWriter ( fw ) ) {
bw . write ( content ) ; 
} 
} 
    }
