package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Evaluation69 extends AbstractBaseEvaluation {

    public Evaluation69(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    private Map<LinkedList<Integer>, Integer> init() {
        Map<LinkedList<Integer>, Integer> map = new HashMap<>();
        LinkedList<Integer> input1 = new LinkedList<>();
        input1.add(1);
        input1.add(2);
        map.put(input1, 2);
        LinkedList<Integer> input2 = new LinkedList<>();
        input2.add(10);
        input2.add(7);
        map.put(input2, 10);
        return map;
    }

    @Override
    public int[] evaluation() {
        Map<LinkedList<Integer>, Integer> map = init();
        int passCount = 0;

        for (Map.Entry<LinkedList<Integer>, Integer> entry : map.entrySet()) {
            try {
                int result = solution.getMax(entry.getKey());
                if (result == entry.getValue()) {
                    passCount++;
                }
            } catch (Exception e) {
                System.out.println(1);
            }
        }
        return new int[]{passCount, map.size()};
    }
}
