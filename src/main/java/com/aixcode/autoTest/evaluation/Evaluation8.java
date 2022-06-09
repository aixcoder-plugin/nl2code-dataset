package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation8 extends AbstractBaseEvaluation {


    public Evaluation8(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Map<int[],Integer> map = new HashMap<int[],Integer>();
        int[] a1 = {1,2,3,2,5};
        int[] a2 = {1,2,3,4,3};
        int[] a3 = {1,2,3,3,2};
        int[] a4 = {1,2,3,4,3};
        int[] a5 = {1,2,3,4,5};
        map.put(a1,5);
        map.put(a2,4);
        map.put(a3,3);
        map.put(a4,4);
        map.put(a5,5);
        int pass_count = 0;

        for(Map.Entry<int[],Integer> entry:map.entrySet()){
            try{
                if(solution.findMaxNumber(entry.getKey()) == entry.getValue()){
                    pass_count++;
                }
                //assertEquals(checkUsername(entry.getKey()),entry.getValue());
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
