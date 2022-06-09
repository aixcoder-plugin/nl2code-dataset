package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.io.Reader;
import java.io.StringReader;

public class Evaluation4 extends AbstractBaseEvaluation {


    public Evaluation4(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
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
