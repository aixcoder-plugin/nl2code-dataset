package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.sampleHelperClass.sample27.TestFor27;
import com.aixcode.autoTest.version1.copilot.Copilot91;
import com.aixcode.autoTest.version1.copilot.Copilot95;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder91;

import java.beans.JavaBean;
import java.util.HashMap;
import java.util.Map;

public class Check91 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot91 solution=new Copilot91();
        String name1 = "main.com.aixcode.autoTest.copilot.Copilot95";
        String name2 = "main.com.aixcode.helper.sample91.InterfaceWithAnnotation";
        Map<Class,String> map = new HashMap<Class,String>(){{
            put(Copilot95.class,name1);
            put(TestFor27.class,name2);
        }};
        int pass_count = 0;

        for(Map.Entry<Class,String> entry:map.entrySet()){
            try{
                if(solution.getInterfaceName(entry.getKey(), JavaBean.class).equals(entry.getValue())){
                    pass_count++;
                }
                //assertEquals(checkUsername(entry.getKey()),entry.getValue());
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder91 solution=new Aixcoder91();
        String name1 = "main.com.aixcode.autoTest.copilot.Copilot95";
        String name2 = "main.com.aixcode.helper.sample91.InterfaceWithAnnotation";
        Map<Class,String> map = new HashMap<Class,String>(){{
            put(Copilot95.class,name1);
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
