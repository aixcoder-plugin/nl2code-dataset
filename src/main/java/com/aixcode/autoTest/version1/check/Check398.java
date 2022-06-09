package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.copilot.Copilot398;

import java.util.HashMap;
import java.util.Map;

public class Check398 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot398 solution=new Copilot398();
        Map<String,Boolean> map = new HashMap<String,Boolean>();
        map.put("ade1990",true);
        map.put("bg",false);
        map.put("cdjfas;d",false);
        map.put("sa_19dsajfasd",true);
        map.put("____________",true);
        int pass_count = 0;

        for(Map.Entry<String,Boolean> entry:map.entrySet()){
            try{
                if(solution.checkUsername(entry.getKey()) == entry.getValue()){
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
        return new int[0];
    }
}
