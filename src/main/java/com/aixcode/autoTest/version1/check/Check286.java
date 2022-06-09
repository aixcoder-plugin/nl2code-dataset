package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder286;
import com.aixcode.autoTest.version1.copilot.Copilot286;

import java.util.HashMap;
import java.util.Map;

public class Check286 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot286 solution = new Copilot286();
        int n = 10;
        int[][] arr = new int[n][n];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>(){{
            put(0,n+1);
            put(1,n+2);
            put(2,n+3);
            put(3,n+4);
            put(4,n+5);
        }};
        int pass_count = 0;
        solution.init(arr,n);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            try{
                if(arr[entry.getKey()].length <= entry.getValue()){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder286 solution = new Aixcoder286();
        int n = 10;
        int[][] arr = new int[n][n];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>(){{
            put(0,n+1);
            put(1,n+2);
            put(2,n+3);
            put(3,n+4);
            put(4,n+5);
        }};
        int pass_count = 0;
        solution.init(arr,n);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            try{
                if(arr[entry.getKey()].length <= entry.getValue()){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
