package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation1 extends AbstractBaseEvaluation {

    public Evaluation1(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Map<Integer,String> map = new HashMap<Integer,String>(){{
            put(1,"a");
            put(2,"aa");
            put(3,"aaa");
            put(4,"aaaa");
            put(5,"aaaaa");
        }};
        int pass_count = 0;

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            try{
                if(solution.createPadding(entry.getKey(),'a').equals(entry.getValue())){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
