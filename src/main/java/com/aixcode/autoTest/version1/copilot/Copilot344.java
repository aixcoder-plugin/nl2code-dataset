package com.aixcode.autoTest.version1.copilot;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Copilot344 {
    /**
     * Write content to the file. If file does not exist, it will create one.
     */
    public static void writeToFile(String content, String fileName) {
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
