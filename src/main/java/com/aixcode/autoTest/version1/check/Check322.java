package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder322;
import com.aixcode.autoTest.version1.copilot.Copilot322;

import java.util.HashMap;
import java.util.Map;

public class Check322 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot322 solution = new Copilot322();
        Map<Integer,String> map = new HashMap<Integer,String>(){{
            put(1,"a");
            put(2,"aa");
            put(3,"aaa");
            put(4,"aaaa");
            put(5,"aaaaa");
        }};
        int pass_count = 0;

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            try{
                if(solution.createPadding(entry.getKey(),'a').equals(entry.getValue())){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder322 solution = new Aixcoder322();
        Map<Integer,String> map = new HashMap<Integer,String>(){{
            put(1,"a");
            put(2,"aa");
            put(3,"aaa");
            put(4,"aaaa");
            put(5,"aaaaa");
        }};
        int pass_count = 0;

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            try{
                if(solution.createPadding(entry.getKey(),'a').equals(entry.getValue())){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
