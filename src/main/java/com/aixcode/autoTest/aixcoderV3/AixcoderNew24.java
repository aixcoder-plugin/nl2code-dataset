package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

public class AixcoderNew24 extends GenerateMethodBase {
    public void writeFile(Collection<String> lines, File file) {
        try {
            if (file.exists()) {
                file.delete();
            }
            if (!file.exists()) {
// noinspection ResultOfMethodCallIgnored
                file.getParentFile().mkdirs();
// noinspection ResultOfMethodCallIgnored
                file.createNewFile();
            }
            try (FileWriter fileWriter = new FileWriter(file)) {
                for (String line : lines) {
                    fileWriter.write(line);
                    fileWriter.write("\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
