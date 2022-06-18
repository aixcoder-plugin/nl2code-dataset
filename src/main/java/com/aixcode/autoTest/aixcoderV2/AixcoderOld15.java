package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
public class AixcoderOld15 extends GenerateMethodBase {
    public void copyFile(String sourcePath, String destPath) throws IOException {
        Path source = Paths.get(sourcePath);
        Path dest = Paths.get(destPath);
        Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
    }
}
