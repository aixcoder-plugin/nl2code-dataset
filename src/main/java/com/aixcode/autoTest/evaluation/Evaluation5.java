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
        float[] f1 = {1.00001f,1,0.9999f};
        float[] f2 = {0,-1,-0.000001f};
        float[] f3 = {Float.MIN_VALUE,3,1};
        float[] f4 = {-4,-3,Float.MAX_VALUE};
        float[] f5 = {Float.MIN_NORMAL,Float.MIN_NORMAL,Float.MIN_NORMAL};
        Map<float[],Float> map = new HashMap<float[],Float>(){{
            put(f1,1.00001f);
            put(f2,0f);
            put(f3,3f);
            put(f4,Float.MAX_VALUE);
            put(f5,Float.MIN_NORMAL);
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
