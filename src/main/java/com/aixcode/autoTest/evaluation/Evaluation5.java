package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation5 extends AbstractBaseEvaluation {


    public Evaluation5(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        float[] f1 = {1,3,2};
        float[] f2 = {3,3,1};
        float[] f3 = {2,3,1};
        float[] f4 = {4,3,2};
        float[] f5 = {5,3,4};
        Map<float[],Float> map = new HashMap<float[],Float>(){{
            put(f1,3f);
            put(f2,3f);
            put(f3,3f);
            put(f4,4f);
            put(f5,5f);
        }};
        int pass_count = 0;

        for(Map.Entry<float[],Float> entry:map.entrySet()){
            try{
                if(solution.max(entry.getKey()[0],entry.getKey()[1],entry.getKey()[2]) == entry.getValue()){
                    pass_count++;
                }
                //assertEquals(checkUsername(entry.getKey()),entry.getValue());
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}