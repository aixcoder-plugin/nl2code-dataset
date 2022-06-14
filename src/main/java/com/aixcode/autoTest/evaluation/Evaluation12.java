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
            add("abcefghijklmnopqrstuvwxyz");
            add("");
            add(null);
            add("1234");
            add("true");
        }};

        List<String> list3 = new ArrayList<String>();
        Map<Integer,String> map = new HashMap<Integer, String>(){{
            put(0,"abcefghijklmnopqrstuvwxyz");
            put(1,"");  //空字符串
            put(2,null);// element 3 is null
            put(3,"1234");
            put(4,"true");
            put(5,null);//out of range
        }};
        int pass_count = 0;

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            try{
                Object resultValue = solution.getValue(list1,entry.getKey());
                if(resultValue == null && entry.getValue() == null){
                    pass_count++;
                    continue;
                }else if (resultValue == null) {
                    continue;
                }if(resultValue != null && resultValue.equals(entry.getValue())){
                    pass_count++;
                }
            }catch(Exception e){
            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
