package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Evaluation78 extends AbstractBaseEvaluation {


    public Evaluation78(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    private Map<List<String>, String> init() {
        Map<List<String>, String> map = new HashMap<>();
        List<String> input1 = new ArrayList<>();
        input1.add("test");
        input1.add("t");
        input1.add("a");
        map.put(input1, "aest");
        List<String> input2 = new ArrayList<>();
        input2.add("test");
        input2.add("aa");
        input2.add("bb");
        map.put(input2, "test");


        return map;
    }

    @Override
    public int[] evaluation() {
        Map<List<String>, String> map = init();
        int passCount = 0;

        for (Map.Entry<List<String>, String> entry : map.entrySet()) {
            try {
                String result = solution.replaceFirst(entry.getKey().get(0), entry.getKey().get(1), entry.getKey().get(2));
                if (result.equals(entry.getValue())) {
                    passCount++;
                }
            } catch (Exception e) {
                System.out.println(1);
            }
        }
        return new int[]{passCount, map.size()};
    }
}
