package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation25 extends AbstractBaseEvaluation {


    public Evaluation25(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        byte[] data1 = {'a','z'}; // byte from char: 'a' to 'z'
        byte[] data2 = {'0','1'}; //byte from char: '0' to '9'
        byte[] data3 = {1,15,127}; //byte from int: 1 to 127
        byte[] data4 = {'A','Z'}; //byte from char: 'A' to 'Z'
        byte[] data5 = {0,0,0,0}; //all is zero
        Map<byte[],String> map = new HashMap<byte[],String>(){{
            put(data1,"617a");
            put(data2,"3031");
            put(data3,"010f7f");
            put(data4,"415a");
            put(data5,"00000000");
        }};
        int pass_count = 0;

        for(Map.Entry<byte[],String> entry:map.entrySet()){
            try{
                if(solution.toHex(entry.getKey()).equals( entry.getValue())){
                    pass_count++;
                }else {
                    System.out.println(solution.toHex(entry.getKey()) + " " + entry.getValue());
                }
                //assertEquals(checkUsername(entry.getKey()),entry.getValue());
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
