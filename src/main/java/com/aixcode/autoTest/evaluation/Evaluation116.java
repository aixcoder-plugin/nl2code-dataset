package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.*;

public class Evaluation116 extends AbstractBaseEvaluation {

    public Evaluation116(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    List<int[]> originList=new ArrayList<>(){{
        add(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25});
        add(new int[]{8,9,13,21,23});
        add(new int[]{221,2122,234,28535});
        add(new int[]{});
    }};
    List<Long> sizeList=new ArrayList<>(){{
        add(10L);
        add(12L);
        add(4L);
        add(10L);
    }};

    List<int[]> targetList=new ArrayList<>(){{
        add(new int[]{1,2,3,4,5,6,7,8,9,10});
        add(new int[]{8,9,13,21,23});
        add(new int[]{221,2122,234,28535});
        add(new int[]{});
    }};

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        for (int i = 0; i < originList.size(); i++) {
            try {
                int[] origin = originList.get(i);
                int[] target = targetList.get(i);
                long size = sizeList.get(i);
                int[] result = solution.resize(origin, size);
                if (Arrays.equals(result, target)) {
                    pass_count++;
                }
            } catch (Exception ex) {

            }
        }
        return new int[]{pass_count, originList.size()};
    }
}
