package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation21 extends AbstractBaseEvaluation {


    public Evaluation21(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Map<String,Object> mapPerperties = new HashMap<String,Object>(){{
            put("a","a");
            put("b","b");
            put("c","c");
            put("d","d");
            put("e","e");
        }};
        Map<String,Object> mAdditional = new HashMap<String,Object>(){{
            put("c","a");//existed， value replaced
            put("d",null); //existed， value is null
            put("e","e"); //existed， value not changed
            put("f","x");//non-existed key， add it
            put("g",null);//non-existed key， add it， value is null
        }};

        int pass_count = 0;

        for(Map.Entry<String,Object> entry:mAdditional.entrySet()){
            try{
                if(null == mapPerperties.get(entry.getKey())){
                    solution.putAdditionalProperty(entry.getKey(),entry.getValue(),mapPerperties);
                    if (entry.getValue() != null && mapPerperties.get(entry.getKey()).equals(entry.getValue())){
                        pass_count++;
                    }else if(entry.getValue() == null && mapPerperties.get(entry.getKey()) == null){
                        pass_count++;
                    }
                }else{
                    Object value = mapPerperties.get(entry.getKey());
                    solution.putAdditionalProperty(entry.getKey(),entry.getValue(),mapPerperties);
                    Object newValue = mapPerperties.get(entry.getKey());
                    if (!value.equals(newValue)){
                        pass_count++;
                    }else if(entry.getValue().equals(newValue)){
                        pass_count++;
                    }
                }

            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return new int[]{pass_count,mAdditional.entrySet().size()};
    }
}
