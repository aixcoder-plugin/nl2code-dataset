package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;
import com.aixcode.autoTest.generate.copilot.GenerateMethod95;
import com.aixcode.sampleHelper.sample27.TestFor27;

import java.beans.JavaBean;
import java.util.HashMap;
import java.util.Map;

public class Evaluation27 extends AbstractBaseEvaluation {


    public Evaluation27(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        String name1 = "main.com.aixcode.autoTest.copilot.Copilot95";
        String name2 = "main.com.aixcode.helper.sample91.InterfaceWithAnnotation";
        Map<Class,String> map = new HashMap<Class,String>(){{
            put(GenerateMethod95.class,name1);
            put(TestFor27.class,name2);
        }};
        int pass_count = 0;

        for(Map.Entry<Class,String> entry:map.entrySet()){
            try{
                if(solution.getInterfaceName(entry.getKey(),JavaBean.class).equals(entry.getValue())){
                    pass_count++;
                }
                //assertEquals(checkUsername(entry.getKey()),entry.getValue());
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
