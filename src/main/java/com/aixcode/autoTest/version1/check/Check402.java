package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder402;
import com.aixcode.autoTest.version1.copilot.Copilot402;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Check402 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot402 solution = new Copilot402();
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
        return new int[]{pass_count,1};
    }

    @Override
    public int[] checkAixcoder() {
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
        return new int[]{pass_count,1};
    }
}
