package com.aixcode.autoTest.version1.check;


import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder24;
import com.aixcode.autoTest.version1.copilot.Copilot24;

import java.io.*;

public class Check24 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot24 solution = new Copilot24();
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

    @Override
    public int[] checkAixcoder() {
        Aixcoder24 solution = new Aixcoder24();
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
