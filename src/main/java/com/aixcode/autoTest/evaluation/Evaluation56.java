package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation56 extends AbstractBaseEvaluation {


    public Evaluation56(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;

        Map<Character, Boolean> map = new HashMap<>();
        map.put('a', true);
        map.put('Z', true);
        map.put('A', true);
        map.put('z', true);
        map.put('4', false);
        map.put('\0', false);
        map.put('\\', false);

        for(Map.Entry<Character, Boolean> entry : map.entrySet()) {
            try {
                if(solution.isLetter(entry.getKey()) == entry.getValue()) {
                    pass_count++;
                }
            }catch (Exception e){

            }

        }
        return new int[]{pass_count, map.size()};
    }
}
