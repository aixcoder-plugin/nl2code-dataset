package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder298;
import com.aixcode.autoTest.version1.copilot.Copilot298;

import java.util.HashMap;
import java.util.Map;


public class Check298 extends BaseAbstractTest {
    public Map<String,String> map=new HashMap<>(){
        {
            put("US-ASCII", "US-ASCII");
            put("ISO646-US", "US-ASCII");
            put("utf-8", "UTF-8");
            put("utf-16BE", "UTF-16BE");
        }
    };
    @Override
    public int[] checkCopilot() {
        Copilot298 solution = new Copilot298();
        int pass_count = 0;
        for(Map.Entry<String,String> entry:map.entrySet()){
            try{
                if(solution.canonicalEncodingName(entry.getKey()).equals(entry.getValue())){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder298 solution = new Aixcoder298();
        int pass_count = 0;
        for(Map.Entry<String,String> entry:map.entrySet()){
            try{
                if(solution.canonicalEncodingName(entry.getKey()).equals(entry.getValue())){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
