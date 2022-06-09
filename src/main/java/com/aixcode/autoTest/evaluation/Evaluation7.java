package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation7 extends AbstractBaseEvaluation {


    public Evaluation7(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Map<String,Boolean> map = new HashMap<String,Boolean>();
        map.put("https://www.baidu.com",true);
        map.put("https://aixcoder.com",true);
        map.put("https://gitee.com/",true);
        map.put("http://aixcoder.com:90",true);
        map.put("http://testserver3.nnthink.com:8887",true);
        int pass_count = 0;

        for(Map.Entry<String,Boolean> entry:map.entrySet()){
            try{
                if((solution.getProperties(entry.getKey()).size()>0) == entry.getValue()){
                    pass_count++;
                }
                //assertEquals(checkUsername(entry.getKey()),entry.getValue());
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
