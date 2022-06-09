package com.aixcode.autoTest.evaluation;


import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.io.*;

public class Evaluation18 extends AbstractBaseEvaluation {


    public Evaluation18(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        String fileName = "a.txt";
        String content = "abc";
        int pass_count = 0 ;
        try {
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName,true)));
            out.write(content);
            out.close();
        }catch (IOException e) {
        }
        File file = new File(fileName);
        try {
            FileInputStream in = new FileInputStream(file);
            String content1 = new String(solution.readBytes(in,in.available()));
            if (content1.equals(content)){
                pass_count++;
            }
            in.close();
        }catch (Exception e) {

        }
        file.delete();
        return  new int[]{pass_count,1};
    }
}
