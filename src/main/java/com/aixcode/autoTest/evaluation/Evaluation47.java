package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.lang.reflect.Field;
import java.util.*;

public class Evaluation47 extends AbstractBaseEvaluation {
    private Map<String, Object> sourceMap = new HashMap<>();

    public Evaluation47(String basePackage, String prefix) {
        super(basePackage, prefix);
        sourceMap.put("Date.java", new Date());
        sourceMap.put("exception", new Exception("haha"));
        sourceMap.put("String", new StringBuilder("test"));
        sourceMap.put("array", Calendar.getInstance());
        sourceMap.put("", new HashMap<>());
    }


    @Override
    public int[] evaluation() {
        int pass_count = 0;
        int total_count = sourceMap.size();

        for(Map.Entry<String, Object> entry : sourceMap.entrySet()) {
            String expectedFName = entry.getKey();
            try {
                List<Field> res = solution.getFields(entry.getValue().getClass());
                if (res != null) {
                    pass_count++;
                }

            } catch (Exception e) {
                continue;
            }
        }
        try {
            total_count++;
            solution.getFields(null);
            pass_count++;
        }catch (Exception e) {

        }
        return new int[]{pass_count,total_count};
    }
}
