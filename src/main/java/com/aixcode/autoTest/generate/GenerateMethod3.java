package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateMethod3 extends GenerateMethodBase {
    /**
     * Write content to the file. If file does not exist, it will create one.
     */
    public void writeToFile(String content, String fileName) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
