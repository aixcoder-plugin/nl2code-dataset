package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation93 extends AbstractBaseEvaluation {
    public static Map<String,Boolean> checkMap = new HashMap<>(){
        {
            put("2.1",true);
            put("5a",false);
            put("2e3",true);
            put("0x8",true);
            put("03",true);
        }
    };

    public Evaluation93(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int passCount=0;
        for(Map.Entry<String,Boolean> entry:checkMap.entrySet()){
            String key=entry.getKey();
            Boolean value=entry.getValue();
            try {
                if (solution.isNumber(key)==value){
                    passCount++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,checkMap.size()};
    }
}
