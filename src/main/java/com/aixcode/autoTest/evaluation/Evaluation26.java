package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Evaluation26 extends AbstractBaseEvaluation {


    public Evaluation26(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        File dir = new File("");
        String filePath1 = new File("src/main/java/com/aixcode/autoTest/Excutor.java").getAbsolutePath().replaceAll("\\\\","//");
        Map<String,Boolean> map = new HashMap<String,Boolean>(){{
            put(filePath1,true);
        }};
        int pass_count = 0;
        for(Map.Entry<String,Boolean> entry:map.entrySet()){
            try{
                if((solution.getInputStream(entry.getKey())!=null) == entry.getValue()){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
