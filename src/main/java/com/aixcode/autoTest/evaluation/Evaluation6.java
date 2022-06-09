package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation6 extends AbstractBaseEvaluation {


    public Evaluation6(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
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
