package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder100;
import com.aixcode.autoTest.version1.copilot.Copilot100;

import java.util.HashMap;
import java.util.Map;

public class Check100 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot100 solution=new Copilot100();
        byte[] data1 = {'a'};
        byte[] data2 = {'a','b'};
        byte[] data3 = {'a','b','c'};
        byte[] data4 = {'a','b','c','d'};
        byte[] data5 = {'a','b','c','d','e'};
        Map<byte[],String> map = new HashMap<byte[],String>(){{
            put(data1,"61");
            put(data2,"6162");
            put(data3,"616263");
            put(data4,"61626364");
            put(data5,"6162636465");
        }};
        int pass_count = 0;

        for(Map.Entry<byte[],String> entry:map.entrySet()){
            try{
                if(solution.toHex(entry.getKey()).equals( entry.getValue())){
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
        Aixcoder100 solution=new Aixcoder100();
        byte[] data1 = {'a'};
        byte[] data2 = {'a','b'};
        byte[] data3 = {'a','b','c'};
        byte[] data4 = {'a','b','c','d'};
        byte[] data5 = {'a','b','c','d','e'};
        Map<byte[],String> map = new HashMap<byte[],String>(){{
            put(data1,"61");
            put(data2,"6162");
            put(data3,"616263");
            put(data4,"61626364");
            put(data5,"6162636465");
        }};
        int pass_count = 0;

        for(Map.Entry<byte[],String> entry:map.entrySet()){
            try{
                if(solution.toHex(entry.getKey()).equals( entry.getValue())){
                    pass_count++;
                }
                //assertEquals(checkUsername(entry.getKey()),entry.getValue());
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
