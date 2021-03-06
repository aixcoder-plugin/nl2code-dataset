package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Evaluation0 extends AbstractBaseEvaluation {

    public Evaluation0(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        List<String> list1 = new ArrayList<String>(){{
            add("a");
            add("b");
            add("c");
        }};// one comma + and
        List<String> list2 = new ArrayList<String>(){{
            add("d");
            add("e");
        }};// only and
        List<String> list3 = new ArrayList<String>(){{
            add("你");
        }}; //no comma and no and
        List<String> list4 = new ArrayList<String>();//list length is 0

        List<String> list5 = new ArrayList<String>(){{
            add("1");
            add("2");
            add("3");
            add("4");
            add("5");
            add("6");
        }};// multiple comma + and

        Map<List<String>,String> map = new HashMap<List<String>,String>(){{
            put(list1,"a,bandc");
            put(list2,"dande");
            put(list3,"你");
            put(list4,"");
            put(list5,"1,2,3,4,5and6");
        }};
        int pass_count = 0;

        for(Map.Entry<List<String>,String> entry:map.entrySet()){
            try{
                if(solution.collectionToCommaDelimitedString(entry.getKey()).replaceAll(" ","").equals(entry.getValue())){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
