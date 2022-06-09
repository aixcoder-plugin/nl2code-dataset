package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Evaluation68 extends AbstractBaseEvaluation {


    public Evaluation68(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    private Map<ArrayList<String>, String> init() {
        Map<ArrayList<String>, String> map = new HashMap<>();
        ArrayList<String> input1 = new ArrayList<>();
        input1.add("a");
        input1.add("b");
        map.put(input1, "b");
        ArrayList<String> input2 = new ArrayList<>();
        map.put(input2, null);
        ArrayList<String> input3 = new ArrayList<>();
        input3.add("a");
        map.put(input3, "a");
        return map;
    }

    @Override
    public int[] evaluation() {
        Map<ArrayList<String>, String> map = init();
        int passCount = 0;

        for (Map.Entry<ArrayList<String>, String> entry : map.entrySet()) {
            try {
                String result = solution.removeLast(entry.getKey());
                if (result == null && entry.getValue() == null) {
                    passCount++;
                } else if (result.equals(entry.getValue())) {
                    passCount++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new int[]{passCount, map.size()};
    }
}
