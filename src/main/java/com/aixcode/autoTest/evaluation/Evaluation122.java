package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation122 extends AbstractBaseEvaluation {

    public Evaluation122(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        Map<long[][],Boolean> map = new HashMap<>(){{
            put(new long[][]{{-1},{1}}, false);
            put(new long[][]{{-3}, {1,12}}, false);
            put(new long[][]{{1},{2}}, true);
            put(new long[][]{{1,2},{}}, true);
            put(new long[][]{{1,2},{-2}}, false);
        }};
        for (Map.Entry<long[][],Boolean> entry : map.entrySet()){
            try {
                if (solution.isNonNegative(entry.getKey())==entry.getValue()){
                    pass_count++;
                }
            }catch (Exception e){

            }
        }
        return new int[]{pass_count,map.size()};
    }
}
