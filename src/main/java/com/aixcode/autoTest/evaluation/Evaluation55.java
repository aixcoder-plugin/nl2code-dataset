package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation55 extends AbstractBaseEvaluation {


    public Evaluation55(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        Map<String, Boolean> map = new HashMap<>();
        map.put("abcdefghijklmnopqrstuvwxyz", true);//lower case letters
        map.put("ABCDEFGHIJKLMNOPQRSTUVWYXZ", true);//upper case alphabet
        map.put("1234567890", true);//digits
        map.put("MIaoXW0921", true);//mix
        map.put("miaoxw@163.com", false);
        map.put("I\0\nU", false);
        map.put("\\localPath\\xxx.txt", false);

        for(Map.Entry<String, Boolean> entry : map.entrySet()) {
            try {
                if(solution.isLetterOrDigit(entry.getKey()) == entry.getValue()) {
                    pass_count++;
                }
            }catch (Exception e){

            }

        }
        return new int[]{pass_count, map.size()};
    }
}
