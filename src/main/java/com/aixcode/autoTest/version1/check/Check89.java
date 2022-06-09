package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder89;
import com.aixcode.autoTest.version1.copilot.Copilot89;

import java.util.HashMap;
import java.util.Map;

public class Check89 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot89 solution=new Copilot89();
        Map<String,Object> map = new HashMap<>();
        map.put("userId",1);
        map.put("status",2);
        map.put("1234",3);
        map.put("ABCD",4);
        map.put("",5);
        //map.put(null,6);

        int total_count = map.size();
        int pass_count = 0;

        try{
            Map<String,Object> resMap = solution.getAllUpperCase(map);
            for(String key : map.keySet()){
                if(key != null){
                    if(resMap.get(key.toUpperCase()) == map.get(key)){
                        pass_count++;
                    }
                }
                else{
                    if(map.get(key) == (Object)6){
                        pass_count++;
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }

        return new int[]{pass_count,total_count};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder89 solution=new Aixcoder89();
        Map<String,Object> map = new HashMap<>();
        map.put("userId",1);
        map.put("status",2);
        map.put("1234",3);
        map.put("ABCD",4);
        map.put("",5);
        //map.put(null,6);

        int total_count = map.size();
        int pass_count = 0;

        try{
            Map<String,Object> resMap = solution.getAllUpperCase(map);
            for(String key : map.keySet()){
                if(key != null){
                    if(resMap.get(key.toUpperCase()) == map.get(key)){
                        pass_count++;
                    }
                }
                else{
                    if(map.get(key) == (Object)6){
                        pass_count++;
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }

        return new int[]{pass_count,total_count};
    }
    public int[] check() {
        Copilot89 solution=new Copilot89();
        Map<String,Object> map = new HashMap<>();
        map.put("userId",1);
        map.put("status",2);
        map.put("1234",3);
        map.put("ABCD",4);
        map.put("",5);
        //map.put(null,6);

        int total_count = map.size();
        int pass_count = 0;

        try{
            Map<String,Object> resMap = solution.getAllUpperCase(map);
            for(String key : map.keySet()){
                if(key != null){
                    if(resMap.get(key.toUpperCase()) == map.get(key)){
                        pass_count++;
                    }
                }
                else{
                    if(map.get(key) == (Object)6){
                        pass_count++;
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }

        return new int[]{pass_count,total_count};
    }
}
