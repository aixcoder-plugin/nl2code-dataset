package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.*;
import java.util.Collection;

public class AixcoderAuto24 extends GenerateMethodBase {
    /**
     * Writes a collection of Strings to a File, overwriting any previous file contents. Each String is converted into a line in the File.
     */
    public void writeFile(Collection<String> lines, File file) throws IOException {
        if (file == null) {
            throw new IOException("File is null");
        }

        if (!file.exists()) {
            file.createNewFile();
        }

        FileOutputStream fos = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        PrintWriter writer = new PrintWriter(bos);

        for (String line : lines) {
            writer.println(line);
        }

        writer.close();
    }
}
