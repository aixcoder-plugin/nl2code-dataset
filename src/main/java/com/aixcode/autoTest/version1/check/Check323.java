package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder323;
import com.aixcode.autoTest.version1.copilot.Copilot323;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Check323 extends BaseAbstractTest {
    Map<String, HashSet<Integer>> map = new HashMap<>(){
        {
            put("F1",new HashSet<>(){
                {
                    add(21);
                }
            });
            put("65",new HashSet<>(){
                {
                    add(32);
                    add(42);
                }
            });
            put("3a",new HashSet<>());
            put("5b",null);
        }
    };
    Map<String,Integer> map2 = new HashMap<>(){
        {
            put("F1",12);
            put("65",32);
            put("3a",1);
            put("dc",21);
            put("5b",5);
        }
    };
    @Override
    public int[] checkCopilot() {
        Copilot323 solution=new Copilot323();
        int passCount=0;
        for(Map.Entry<String,Integer> entry:map2.entrySet()){
            String key=entry.getKey();
            Integer value=entry.getValue();
            try {
                solution.addToSet(map,key,value);
                if (map.get(key).contains(value)){
                    if (key.equals("65")){
                        if(map.get(key).size()==2){
                            passCount++;
                        }
                    }else {
                        passCount++;
                    }

                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,map2.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder323 solution=new Aixcoder323();
        int passCount=0;
        for(Map.Entry<String,Integer> entry:map2.entrySet()){
            String key=entry.getKey();
            Integer value=entry.getValue();
            try {
                solution.addToSet(map,key,value);
                if (map.get(key).contains(value)){
                    if (key.equals("65")){
                        if(map.get(key).size()==2){
                            passCount++;
                        }
                    }else {
                        passCount++;
                    }

                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,map2.size()};
    }
}
