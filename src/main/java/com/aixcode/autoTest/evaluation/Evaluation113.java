package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation113 extends AbstractBaseEvaluation {

    public Evaluation113(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        String[] a = new String[]{"a"};
        String[] b = new String[]{"a", "b", "c"};
        String[] c = new String[]{"abc", "abc", "abc", "bcd"};
        String a1 = "a";
        String a2 = "a b c";
        String a3 = "abc abc abc bcd";
        Map<String[], String> map = new HashMap<>(){{
            put(a, a1);
            put(b, a2);
            put(c, a3);
        }};
        int pass_count = 0;
        for (Map.Entry<String[],String> entry : map.entrySet()){
            try {
                if (solution.getStringfromStringArray(entry.getKey()).equals(entry.getValue())){
                    pass_count++;
                }
            }catch (Exception ex) {

            }
        }
        return new int[]{pass_count, map.size()};
    }
}
