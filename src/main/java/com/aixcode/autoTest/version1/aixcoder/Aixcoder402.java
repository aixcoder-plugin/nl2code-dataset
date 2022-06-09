package com.aixcode.autoTest.version1.aixcoder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Aixcoder402 {
    /**
     * Copy a file from source path to destination path
     */
    public static void copyFile(String sourcePath, String destPath) throws IOException {
        if (sourcePath == null || destPath == null) {
            throw new NullPointerException("Null path");
        }

        if (!new File(sourcePath).exists()) {
            throw new IllegalArgumentException("File does not exist:" + sourcePath);
        }

        if (!new File(destPath).exists()) {
            throw new IllegalArgumentException("File does not exist:" + destPath);
        }

        if (!new File(destPath).getParentFile().exists()) {
            throw new IllegalArgumentException("Parent folder does not exist:" + destPath);
        }

        if (!new File(destPath).getParentFile().canWrite()) {
            throw new IllegalArgumentException("Parent folder is not writable:" + destPath);
        }

        if (!new File(destPath).canWrite()) {
            throw new IllegalArgumentException("File is not writable:" + destPath);
        }

        try(FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(destPath)) {
            byte[] buf = new byte[1024];
            int i;

            while ((i = fis.read(buf)) != -1) {
                fos.write(buf, 0, i);
            }
        }
    }

    public static void main(String[] args) {
        Aixcoder402 solution = new Aixcoder402();
        int pass_count= 0;
        String sourcePath = new File("").getAbsolutePath()+"/source.txt";
        String destPath = new File("").getAbsolutePath()+"/dest.txt";
        try {
            File destFile = new File("dest.txt");
            destFile.createNewFile();
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("source.txt",true)));
            out.write("abc");
            out.close();
            solution.copyFile(sourcePath, destPath);
            String content = new String(Files.readAllBytes(Paths.get(destPath)));
            if (content.equals("abc")) {
                pass_count++;
            }
        }catch (IOException e) {

        }finally {
            File destFile = new File("dest.txt");
            File sourceFile = new File("source.txt");
            if (destFile.exists()){
                destFile.delete();
            }
            if (sourceFile.exists()){
                sourceFile.delete();
            }
        }
    }
}
