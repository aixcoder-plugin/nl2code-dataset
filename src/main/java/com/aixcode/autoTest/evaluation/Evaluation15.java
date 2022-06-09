package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Evaluation15 extends AbstractBaseEvaluation {


    public Evaluation15(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
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
        }catch (Exception e) {

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
