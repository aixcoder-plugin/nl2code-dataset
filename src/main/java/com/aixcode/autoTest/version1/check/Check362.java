package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder362;
import com.aixcode.autoTest.version1.copilot.Copilot362;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Check362 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot362 solution = new Copilot362();
        Map<String,Integer> map = new HashMap<String, Integer>(){{
            put("a",1);
            put("a,b",2);
            put("a,b,c",3);
            put("a,b,c,d",4);
            put("a,b,c,d,e",5);
        }};
        int pass_count = 0;
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            try {
                List<String> list  = solution.split(entry.getKey(),",");
                if (null!=list && list.size() == entry.getValue()){
                    pass_count++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{pass_count,map.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder362 solution = new Aixcoder362();
        Map<String,Integer> map = new HashMap<String, Integer>(){{
            put("a",1);
            put("a,b",2);
            put("a,b,c",3);
            put("a,b,c,d",4);
            put("a,b,c,d,e",5);
        }};
        int pass_count = 0;
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            try {
                List<String> list  = solution.split(entry.getKey(),",");
                if (null!=list && list.size() == entry.getValue()){
                    pass_count++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{pass_count,map.size()};
    }
}
