package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Evaluation124 extends AbstractBaseEvaluation {

    public Evaluation124(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        List<String> list1 = null;
        List<String> list2 = new ArrayList<>(){{
            add("1");
        }};
        List<String> list3 = new ArrayList<>(){{
            add("1");
            add("2");
        }};
        List<String> list4 = new ArrayList<>(){{
            add("1");
            add("2");
            add("3");
        }};
        List<String> list5 = new ArrayList<>(){{
            add("1");
            add("2");
            add("3");
            add("4");
        }};
        Map<List<String>, Integer> map = new HashMap<>(){{
            put(list1,1);
            put(list2, 2);
            put(list3, 3);
            put(list4, 4);
            put(list5, 5);
        }};
        for (Map.Entry<List<String>, Integer> entry : map.entrySet()){
            try {
                List<String> list=  entry.getKey();
                solution.append(list,"23");
                if (null != list && list.size() == entry.getValue()){
                    pass_count++;
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }
}
