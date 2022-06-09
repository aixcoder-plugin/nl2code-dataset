package com.aixcode.autoTest.version1.aixcoder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aixcoder344 {
    /**
     * Write content to the file. If file does not exist, it will create one.
     */
    public static void writeToFile(String content, String fileName) throws IOException {
        try(FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(content);
        }
    }
}
