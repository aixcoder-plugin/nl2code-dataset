package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder95;
import com.aixcode.autoTest.version1.copilot.Copilot95;

import java.util.HashMap;
import java.util.Map;

public class Check95 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot95 solution=new Copilot95();
        byte[] data1 = {'1','1','1','1','1','1',};
        byte[] data2 = {'1','1','1','1','1','1','1',};
        byte[] data3 = {'1','1','1','1','1','1','1','1'};
        byte[] data4 = {'1','1','1','1','1','1','1','1','1'};
        byte[] data5 = {'1','1','1','1','1','1','1','1','1','1'};


        Map<byte[],Integer> map = new HashMap<byte[],Integer>();
        map.put(data1,6);
        map.put(data2,7);
        map.put(data3,8);
        map.put(data4,9);
        map.put(data5,10);
        int pass_count = 0;

        for(Map.Entry<byte[],Integer> entry:map.entrySet()){
            try{
                byte[] data = entry.getKey();
                solution.putShort(data,(short) 2,1);
                if (data.length == entry.getValue() ){
                    pass_count++;
                }

            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder95 solution=new Aixcoder95();
        byte[] data1 = {'1','1','1','1','1','1',};
        byte[] data2 = {'1','1','1','1','1','1','1',};
        byte[] data3 = {'1','1','1','1','1','1','1','1'};
        byte[] data4 = {'1','1','1','1','1','1','1','1','1'};
        byte[] data5 = {'1','1','1','1','1','1','1','1','1','1'};


        Map<byte[],Integer> map = new HashMap<byte[],Integer>();
        map.put(data1,6);
        map.put(data2,7);
        map.put(data3,8);
        map.put(data4,9);
        map.put(data5,10);
        int pass_count = 0;

        for(Map.Entry<byte[],Integer> entry:map.entrySet()){
            try{
                byte[] data = entry.getKey();
                solution.putShort(data,(short) 2,1);
                if (data.length == entry.getValue() ){
                    pass_count++;
                }

            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
