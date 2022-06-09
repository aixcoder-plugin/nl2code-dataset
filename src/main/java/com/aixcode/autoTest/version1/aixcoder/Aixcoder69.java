package com.aixcode.autoTest.version1.aixcoder;

import java.io.*;
import java.util.Collection;

public class Aixcoder69 {
    /**
     * Writes a collection of Strings to a File, overwriting any previous file contents. Each String is converted into a line in the File.
     */
    public static void writeFile(Collection<String> lines, File file) throws IOException {
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
