package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Evaluation75 extends AbstractBaseEvaluation {


    public Evaluation75(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    private Map<List<Integer>, Integer> init() {
        Map<List<Integer>, Integer> map = new HashMap<>();
        List<Integer> input = new ArrayList<>();
        input.add(2022);
        input.add(2);
        map.put(input, 28);
        List<Integer> input1 = new ArrayList<>();
        input1.add(2020);
        input1.add(2);
        map.put(input1, 29);
        List<Integer> input2 = new ArrayList<>();
        input2.add(2020);
        input2.add(12);
        map.put(input2, 31);

        return map;
    }

    @Override
    public int[] evaluation() {
        Map<List<Integer>, Integer> map = init();
        int passCount = 0;

        for (Map.Entry<List<Integer>, Integer> entry : map.entrySet()) {
            try {
                int result = solution.getDaysInMonth(entry.getKey().get(0), entry.getKey().get(1));
                if (result == entry.getValue()) {
                    passCount++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new int[]{passCount, map.size()};
    }
}
