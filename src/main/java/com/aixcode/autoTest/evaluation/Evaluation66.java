package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.*;

public class Evaluation66 extends AbstractBaseEvaluation {


    public Evaluation66(String basePackage, String prefix) {
        super(basePackage, prefix);
    }
    @Override
    public int[] evaluation() {
        Map<String, ArrayList<String>> mapParam1 = new HashMap<>();
        mapParam1.put("one-dup", new ArrayList<>(Arrays.asList("a","b","c")));
        mapParam1.put("all-dup", new ArrayList<>(Arrays.asList("x","y","z")));
        mapParam1.put("no-dup", new ArrayList<>(Arrays.asList("e","f","g")));
        mapParam1.put("one-empty", new ArrayList<>());
        mapParam1.put("empty-value", new ArrayList<>(Arrays.asList("a","b","c")));

        Map<String, ArrayList<String>> mapParam2 = new HashMap<>();
        mapParam2.put("one-dup", new ArrayList<>(Arrays.asList("e","d","c")));
        mapParam2.put("all-dup", new ArrayList<>(Arrays.asList("x","y","z")));
        mapParam2.put("no-dup", new ArrayList<>(Arrays.asList("H","I","J")));
        mapParam2.put("one-empty", new ArrayList<>(Arrays.asList("J","Q","K")));
        mapParam2.put("empty-value", new ArrayList<>(Arrays.asList("","c")));

        Map<String, ArrayList<String>> ExpectedResult = new HashMap<>();
        ExpectedResult.put("one-dup", new ArrayList<>(Arrays.asList("a","b","c","e","d")));
        ExpectedResult.put("all-dup", new ArrayList<>(Arrays.asList("x","y","z")));
        ExpectedResult.put("no-dup", new ArrayList<>(Arrays.asList("e","f","g","H","I","J")));
        ExpectedResult.put("one-empty", new ArrayList<>(Arrays.asList("J","Q","K")));
        ExpectedResult.put("empty-value", new ArrayList<>(Arrays.asList("a","b","c","")));

        int passCount = 0;

        for (Map.Entry<String, ArrayList<String>> entry : ExpectedResult.entrySet()) {
            try {
                String topic = entry.getKey();

                ArrayList<String> result = solution.merge(mapParam1.get(topic), mapParam2.get(topic));
                if (result.equals(entry.getValue())) {
                    passCount++;
                }
            } catch (Exception e) {

            }
        }
        return new int[]{passCount, ExpectedResult.size()};
    }
}
