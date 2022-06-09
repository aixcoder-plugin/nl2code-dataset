package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;
import com.aixcode.autoTest.Excutor;

import java.util.HashMap;
import java.util.Map;

public class Evaluation72 extends AbstractBaseEvaluation {


    public Evaluation72(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    private Map<Class, Class> init() {
        Map<Class, Class> map = new HashMap<>();
        map.put(String.class, String.class);
        map.put(Excutor.class, Excutor.class);

        return map;
    }

    @Override
    public int[] evaluation() {
        Map<Class, Class> map = init();
        int passCount = 0;

        for (Map.Entry<Class, Class> entry : map.entrySet()) {
            try {
                Object result = solution.newInstance(entry.getKey());
                if (result.getClass() == entry.getValue()) {
                    passCount++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new int[]{passCount, map.size()};
    }
}
