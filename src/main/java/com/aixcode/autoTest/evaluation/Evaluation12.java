package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Evaluation12 extends AbstractBaseEvaluation {


    public Evaluation12(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        List<String> list1 = new ArrayList<String>(){{
            add("a");
            add("b");
            add("c");
            add("d");
            add("e");
        }};
        List<Boolean> list2 = new ArrayList<Boolean>(){{
            add(true);
            add(true);
            add(false);
            add(false);
            add(true);
        }};
        Map<Integer,String> map = new HashMap<Integer, String>(){{
            put(0,"a");
            put(1,"b");
            put(2,"d");
            put(3,"c");
            put(4,"e");
        }};
        int pass_count = 0;

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            try{
                if(solution.getValue(list1,entry.getKey()).equals(entry.getValue()) == list2.get(entry.getKey()) ){
                    pass_count++;
                }
                //assertEquals(checkUsername(entry.getKey()),entry.getValue());
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
