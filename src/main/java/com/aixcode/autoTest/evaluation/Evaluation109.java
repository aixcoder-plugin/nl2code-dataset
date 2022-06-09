package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Evaluation109 extends AbstractBaseEvaluation {

    public Evaluation109(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        Map<String[][],String[]> map = new HashMap<>(){{
            put(new String[][]{{"a","b","c"},{"b","c","d"}},new String[]{"a"});
            put(new String[][]{{"c","d","e"},{"c","d","e"}},new String[]{});
            put(new String[][]{{"u","d","e"},{"a","f","c"}},new String[]{"u","d","e"});
            put(new String[][]{{"t","d","e"},{}},new String[]{"t","d","e"});
            put(new String[][]{{},{"a","f","c"}},new String[]{});
        }};
        for (Map.Entry<String[][],String[]> entry : map.entrySet()){
            try {
                String[] result = solution.sub(entry.getKey()[0], entry.getKey()[1]);
                String[] temp = entry.getValue();
                if (Arrays.equals(result, temp)){
                    pass_count++;
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }
}
