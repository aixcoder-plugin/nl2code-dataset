package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation23 extends AbstractBaseEvaluation {


    public Evaluation23(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Float result = 5f;
        float[] f1 = {0,0,3,4};
        float[] f2 = {-1,1,2,5};// X negative point location
        float[] f3 = {2,-3,5,1};// Y positive point location
        float[] f4 = {0,0,-4,-3}; // X， Y All negative
        float[] f5 = {1,1,1,1}; // 0 distance
        Map<float[],Float> map = new HashMap<float[],Float>(){{
            put(f1,result);
            put(f2,result);
            put(f3,result);
            put(f4,result);
            put(f5,0f);
        }};
        int pass_count = 0;
        for (Map.Entry<float[],Float> entry: map.entrySet()){
            try {
                if (solution.distance(entry.getKey()[0],entry.getKey()[1],entry.getKey()[2],entry.getKey()[3]) == entry.getValue()){
                    pass_count ++;
                }
            }catch (Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
