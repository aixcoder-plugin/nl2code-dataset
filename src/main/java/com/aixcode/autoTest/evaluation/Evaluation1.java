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
        Map<Integer,Character> inputMap = new HashMap<Integer,Character>(){{
            put(1,'a');
            put(2,'A');
            put(3,'+');
            put(4,'\t');
            put(5,'0');
        }};

        Map<Integer,String> outputMap = new HashMap<Integer,String>(){{
            put(1,"a");
            put(2,"AA");
            put(3,"+++");
            put(4,"\t\t\t\t");
            put(5,"00000");
        }};
        int pass_count = 0;

        for(Map.Entry<Integer,Character> entry:inputMap.entrySet()){
            try{
                String outputString = outputMap.get(entry.getKey());
                if(solution.createPadding(entry.getKey(),entry.getValue()).equals(outputString)){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,inputMap.entrySet().size()};
    }
}
