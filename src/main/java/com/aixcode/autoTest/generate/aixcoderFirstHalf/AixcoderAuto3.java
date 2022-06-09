package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AixcoderAuto3 extends GenerateMethodBase {
    /**
     * Write content to the file. If file does not exist, it will create one.
     */
    public void writeToFile(String content, String fileName) throws IOException {
        try(FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(content);
        }
    }
}
