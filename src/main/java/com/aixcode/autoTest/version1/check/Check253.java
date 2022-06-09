package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder253;
import com.aixcode.autoTest.version1.copilot.Copilot253;

import java.util.HashMap;
import java.util.Map;

public class Check253 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot253 solution=new Copilot253();
        Map<int[],Integer> map = new HashMap<int[],Integer>();
        int[] a1 = {1,2,3,2,5};
        int[] a2 = {1,2,3,4,3};
        int[] a3 = {1,2,3,3,2};
        int[] a4 = {1,2,3,4,3};
        int[] a5 = {1,2,3,4,5};
        map.put(a1,5);
        map.put(a2,4);
        map.put(a3,3);
        map.put(a4,4);
        map.put(a5,5);
        int pass_count = 0;

        for(Map.Entry<int[],Integer> entry:map.entrySet()){
            try{
                if(solution.findMaxNumber(entry.getKey()) == entry.getValue()){
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
        Aixcoder253 solution=new Aixcoder253();
        Map<int[],Integer> map = new HashMap<int[],Integer>();
        int[] a1 = {1,2,3,2,5};
        int[] a2 = {1,2,3,4,3};
        int[] a3 = {1,2,3,3,2};
        int[] a4 = {1,2,3,4,3};
        int[] a5 = {1,2,3,4,5};
        map.put(a1,5);
        map.put(a2,4);
        map.put(a3,3);
        map.put(a4,4);
        map.put(a5,5);
        int pass_count = 0;

        for(Map.Entry<int[],Integer> entry:map.entrySet()){
            try{
                if(solution.findMaxNumber(entry.getKey()) == entry.getValue()){
                    pass_count++;
                }
                //assertEquals(checkUsername(entry.getKey()),entry.getValue());
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
