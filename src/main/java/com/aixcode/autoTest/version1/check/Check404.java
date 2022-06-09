package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder404;
import com.aixcode.autoTest.version1.copilot.Copilot404;

import java.util.HashMap;
import java.util.Map;

public class Check404 extends BaseAbstractTest {

    Map<Map<String,String>,Integer> map=new HashMap<Map<String,String>,Integer>() {
        {
            put(new HashMap<String, String>() {
                {
                    put("ade1990", "true");
                    put("bg", "false");
                    put("cdjfas;d", "false");
                    put("sa_19dsajfasd", "true");
                    put("____________", "true");
                }
            }, 5);
            put(new HashMap<String, String>() , 0);
            put(new HashMap<String, String>() {
                {
                    put("bg", "false");
                }
            }, 1);
            put(new HashMap<String, String>() {
                {
                    put("ade1990", "true");
                    put("bg", "false");
                    put("cdjfas;d", "false");
                }
            }, 3);
            put(new HashMap<String, String>() {
                {
                    put("ade1990", "true");
                    put("bg", "false");
                    put("cdjfas;d", "false");
                    put("____________", "true");
                }
            }, 4);
        }
    };
    @Override
    public int[] checkCopilot() {
        Copilot404 solution = new Copilot404();
        int pass_count = 0;
        for(Map.Entry<Map<String,String>,Integer> entry:map.entrySet()){
            try{
                if(solution.size(entry.getKey()) == entry.getValue()){
                    pass_count++;
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder404 solution = new Aixcoder404();
        int pass_count = 0;
        for(Map.Entry<Map<String,String>,Integer> entry:map.entrySet()){
            try{
                if(solution.size(entry.getKey()) == entry.getValue()){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
