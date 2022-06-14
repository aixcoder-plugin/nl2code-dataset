package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation20 extends AbstractBaseEvaluation {


    public Evaluation20(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Object[] objs = {"a", null, 123, true};
        Map<Integer,Object> map = new HashMap<Integer, Object>(){{
            put(0, "a");//String value
            put(1, null);//null
            put(2, 123);//numbers
            put(3, true);//boolean
            put(4, null);// out of range
        }};
        int pass_count = 0;
        for (Map.Entry<Integer,Object> entry : map.entrySet()){
            try {
                if (null != entry.getValue()){
                    if (solution.get(objs, entry.getKey()).equals(entry.getValue())){
                        pass_count++;
                    }
                }else{
                    if (null == solution.get(objs, entry.getKey())){
                        pass_count++;
                    }
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count, map.size()};
    }
}
