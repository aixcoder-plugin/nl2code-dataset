package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation107 extends AbstractBaseEvaluation {

    public Evaluation107(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        Map<int[],Boolean> map = new HashMap<>(){{
            put(new int[]{},false);
            put(null,false);
            put(new int[]{1},true);
            put(new int[]{1,2},true);
            put(new int[]{1,2,3},true);
        }};
        for (Map.Entry<int[],Boolean> entry : map.entrySet()){
            try {
                boolean bool = solution.checkNotNullOrEmpty(entry.getKey());
                if (bool == entry.getValue()){
                    pass_count++;
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }
}
