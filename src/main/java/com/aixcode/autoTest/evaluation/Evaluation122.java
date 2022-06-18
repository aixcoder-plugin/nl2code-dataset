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
            put(new long[][]{{-1},{1}}, false);//contain negative array
            put(new long[][]{null, {1,12}}, false);//contain null array
            put(new long[][]{{1},{2}}, true);//all positive array
            put(new long[][]{{1,2},{}}, true);//contain empty array
            put(new long[][]{{1,2},{-2}}, false);
            put(null, false);
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
