package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder268;
import com.aixcode.autoTest.version1.copilot.Copilot268;

import java.util.HashMap;
import java.util.Map;

public class Check268 extends BaseAbstractTest {
    Map<Boolean,String> map=new HashMap<>(){
        {
            put(true,"true");
            put(false,"false");
        }
    };
    @Override
    public int[] checkCopilot() {
        Copilot268 solution = new Copilot268();
        int pass_count = 0;
        for(Map.Entry<Boolean,String> entry:map.entrySet()){
            try{
                if(solution.boolToString(entry.getKey()) == entry.getValue()){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder268 solution = new Aixcoder268();
        int pass_count = 0;
        for(Map.Entry<Boolean,String> entry:map.entrySet()){
            try{
                if(solution.boolToString(entry.getKey()) == entry.getValue()){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
