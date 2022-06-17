package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation41 extends AbstractBaseEvaluation {


    public Evaluation41(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Map<String,Object> map = new HashMap<>();
        map.put("userId",1);
        map.put("status",2);
        map.put("1234",3);
        map.put("ABCD",4);
        map.put("",5);
        //map.put(null,6);

        int total_count = map.size();
        int pass_count = 0;

        try{
            Map<String,Object> resMap = solution.getAllUpperCase(map);
            for(String key : map.keySet()){
                if(key != null){
                    if(resMap.get(key.toUpperCase()) == map.get(key)){
                        pass_count++;
                    }
                }
                else{
                    if(map.get(key) == (Object)6){
                        pass_count++;
                    }
                }
            }
        }catch(Exception e){
        }

        return new int[]{pass_count,total_count};
    }
}
