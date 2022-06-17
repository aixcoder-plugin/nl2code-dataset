package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Evaluation76 extends AbstractBaseEvaluation {


    public Evaluation76(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    Map<String,Integer> map=new HashMap<>(){{
        put("src/main/resources/tempFile/test76/test1",1);
        put("src/main/resources/tempFile/test76/test2",1);
    }};

    @Override
    public int[] evaluation() {
        int passCount = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            try {
                List<String> result = solution.getClassFileNames(entry.getKey());
                if (result.size() == entry.getValue()) {
                    passCount++;
                }
            } catch (Exception e) {
            }
        }
        return new int[]{passCount, map.size()};
    }
}
