package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder272;
import com.aixcode.autoTest.version1.copilot.Copilot272;

import java.io.Reader;
import java.io.StringReader;

public class Check272 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot272 solution = new Copilot272();
        Reader reader = new StringReader("abc");
        int pass_count = 0;
        try {
            solution.close(reader);
           try {
               reader.read();
           }catch (Exception e) {
                pass_count++;
           }
        }catch (Exception e) {

        }
        return new int[]{pass_count,1};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder272 solution = new Aixcoder272();
        Reader reader = new StringReader("abc");
        int pass_count = 0;
        try {
            solution.close(reader);
            try {
                reader.read();
            }catch (Exception e) {
                pass_count++;
            }
        }catch (Exception e) {

        }
        return new int[]{pass_count,1};
    }
}
