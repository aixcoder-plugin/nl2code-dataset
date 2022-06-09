package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation108 extends AbstractBaseEvaluation {

    public Evaluation108(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        Map<String ,String> map = new HashMap<>(){{
           put("a   ","a");
           put("a b","ab");
           put("a b    c","abc");
           put("a b  cd","abcd");
           put("a bc d e","abcde");
        }};
        for (Map.Entry<String,String> entry : map.entrySet()){
            try {
                if(solution.removeAllWhiteSpaces(entry.getKey()).equals(entry.getValue())){
                    pass_count++;
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }
}
