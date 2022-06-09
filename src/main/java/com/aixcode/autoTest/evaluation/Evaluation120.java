package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation120 extends AbstractBaseEvaluation {

    public Evaluation120(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        Map<double[],Integer> map = new HashMap<>(){{
            put(new double[] {1,2},-1);
            put(new double[]{2,1}, 1);
            put(new double[] {1, 1}, 0);
            put(new double[] {-1, -1}, 0);
            put(new double[] {-1, -2}, 1);
        }};
        for (Map.Entry<double[], Integer> entry : map.entrySet()){
            try {
                if (solution.compare(entry.getKey()[0],entry.getKey()[1])==entry.getValue()){
                    pass_count++;
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }
}
