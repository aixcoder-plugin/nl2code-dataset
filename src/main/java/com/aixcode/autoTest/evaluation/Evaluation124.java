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
        List<String> lstNull = null;
        List<String> lstEmpty = new ArrayList<>();
        List<String> lstNormal = new ArrayList<>(){{
            add("str1");
            add("str2");
            add("str3");
            add("str4");
        }};

        Map<Integer,List<String>> params1 = new HashMap<>(){{
            put(1, lstNull); //List is null
            put(2, lstEmpty);//List is empty, not null
            put(3, lstNormal);// List is normal, and String is empty
            put(4, lstNormal);// List is normal, and String is null
            put(5, lstNormal);// List is normal, and String is normal
        }};
        Map<Integer,String> params2 = new HashMap<>(){
            {
                put(1, "normal"); //List is null
                put(2, "normal");//List is empty, not null
                put(3, "");// List is normal, and String is empty
                put(4, null);// List is normal, and String is null
                put(5, "normal");// List is normal, and String is normal
            }
        };

        for (Map.Entry<Integer, List<String>> entry : params1.entrySet()){
            try {
                List<String> list =  entry.getValue();
                Integer key = entry.getKey();
                String paramString = params2.get(key);
                solution.append(list, paramString);
                if (null != list){
                    if((paramString == null && list.get(list.size() - 1) == null) || (paramString != null)&&paramString.equals(list.get(list.size() - 1))){
                        pass_count++;
                    }
                }else {
                    if(params1.get(key) == null){
                        pass_count++;
                    }
                }
            }catch (Exception e) {
            }
        }
        return new int[]{pass_count,params1.size()};
    }
}
