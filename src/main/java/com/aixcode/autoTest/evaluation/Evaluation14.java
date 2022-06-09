package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation14 extends AbstractBaseEvaluation {


    public Evaluation14(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        try {
            int n = 10;
            int[][] arr = new int[n][n];
            Map<Integer,Integer> map = new HashMap<Integer,Integer>(){{
                put(0,n+1);
                put(1,n+2);
                put(2,n+3);
                put(3,n+4);
                put(4,n+5);
            }};
            int pass_count = 0;
            solution.init(arr,n);
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                try{
                    if(arr[entry.getKey()].length <= entry.getValue()){
                        pass_count++;
                    }
                }catch(Exception e){

                }
            }
            return new int[]{pass_count,map.entrySet().size()};
        }catch (Exception e){

        }
        return new int[]{0,5};

    }
}
