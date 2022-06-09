package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder54;
import com.aixcode.autoTest.version1.copilot.Copilot54;

import java.util.HashMap;
import java.util.Map;

public class Check54 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Float result = 5f;
        Copilot54 solution = new Copilot54();
        float[] f1 = {0,0,3,4};
        float[] f2 = {1,1,4,5};
        float[] f3 = {2,3,5,7};
        float[] f4 = {0,0,4,3};
        float[] f5 = {1,1,5,4};
        Map<float[],Float> map = new HashMap<float[],Float>(){{
            put(f1,result);
            put(f2,result);
            put(f3,result);
            put(f4,result);
            put(f5,result);
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

    @Override
    public int[] checkAixcoder() {
        Float result = 5f;
        Aixcoder54 solution = new Aixcoder54();
        float[] f1 = {0,0,3,4};
        float[] f2 = {1,1,4,5};
        float[] f3 = {2,3,5,7};
        float[] f4 = {0,0,4,3};
        float[] f5 = {1,1,5,4};
        Map<float[],Float> map = new HashMap<float[],Float>(){{
            put(f1,result);
            put(f2,result);
            put(f3,result);
            put(f4,result);
            put(f5,result);
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
