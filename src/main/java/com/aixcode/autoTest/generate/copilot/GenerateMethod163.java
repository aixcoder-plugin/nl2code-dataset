package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class GenerateMethod163 extends GenerateMethodBase {
    /**
     * Move a file or directory from source to destination, recursively copying subdirectories.
     */
    public void move(Path src, Path dest) throws IOException {
        if (src.toFile().isDirectory()) {
            if (!dest.toFile().exists()) {
                dest.toFile().mkdirs();
            }
            for (File file : src.toFile().listFiles()) {
                move(file.toPath(), dest.resolve(file.getName()));
            }
        } else {
            if (!dest.toFile().exists()) {
                dest.toFile().createNewFile();
            }
            src.toFile().renameTo(dest.toFile());
        }
    }
}
