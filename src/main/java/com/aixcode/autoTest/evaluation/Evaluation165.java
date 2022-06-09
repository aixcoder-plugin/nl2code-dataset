package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

public class Evaluation165 extends AbstractBaseEvaluation {
    public Evaluation165(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    List<String> textList = new ArrayList<String>() {
        {
            add("IllegalArgumentException");
            add("Decode");
        }
    };

    @Override
    public int[] evaluation() {
        int passCount = 0;
        for (int i = 0; i < textList.size(); i++) {
            String text = textList.get(i);
            byte[] bytes = canonicalSolution(text);
            try {
                byte[] result = solution.base64decode(text);
                if (bytes == null || bytes.length == 0) {
                    if (result == null || result.length == 0) {
                        passCount++;
                    }
                } else {
                    if (Arrays.equals(bytes, result)) {
                        passCount++;
                    }
                }
            } catch (Exception e) {

            }


        }

        return new int[]{passCount, textList.size()};
    }

    private byte[] canonicalSolution(String text) {
        if (text == null) {
            return null;
        }
        return Base64.getDecoder().decode(text);
    }
}
