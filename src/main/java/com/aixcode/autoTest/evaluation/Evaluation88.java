package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation88 extends AbstractBaseEvaluation {
    public Map<String,Integer> map = new HashMap<>(){
        {
            put("0xF1",241);
            put("0x65",101);
            put("0x3a",58);
            put("0xFE",-2);
            put("6a1a",27162);
        }
    };

    public Evaluation88(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int passCount=0;
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            String key=entry.getKey();
            Integer value=entry.getValue();
            try {
                Integer res=solution.hexStringToInt(key);
                if (res.equals(value)){
                    passCount++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,map.size()};
    }
}
