package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation19 extends AbstractBaseEvaluation {


    public Evaluation19(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Map<String,Integer> map = new HashMap<String,Integer>(){{
            put("https://aixcoder.com?id=1",1); //no &
            put("https://aixcoder.com?id=1&rt=123456",2); //has &
            put("https://aixcoder.com?userName=miaoxw&password=123456&enc=UTF-8",3); // multiple &
            put("https://aixcoder.com?id=1&id=2",1);//have duplicate id
            put("https://aixcoder.com",0);//no param
        }};
        int pass_count = 0;
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            try {
                Map<String,String> params = solution.parseQueryString(entry.getKey());
                if(params != null && params.size() == entry.getValue()){
                    pass_count ++;
                }else if(params == null && entry.getValue() == 0){
                    pass_count ++;
                }
            }catch (Exception e) {
            }
        }
        return new int[]{pass_count,map.size()};
    }
}
