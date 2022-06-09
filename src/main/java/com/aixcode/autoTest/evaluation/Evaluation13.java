package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation13 extends AbstractBaseEvaluation {


    public Evaluation13(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        String[] alphabet = {"abcd","efgh","ijkl","1234","7890"};

        int length = 10;
        Map<Integer,String> map = new HashMap<Integer,String>(){{
            put(0,"x");
            put(1,"y");
            put(2,"z");
            put(3,"5");
            put(4,"6");
        }};
        int pass_count = 0;

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            try{
                if(!solution.randomString(length,alphabet[entry.getKey()]).contains(entry.getValue())){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
