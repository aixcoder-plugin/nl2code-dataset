package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation49 extends AbstractBaseEvaluation {


    public Evaluation49(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Map<Long, Integer> lstLong=new HashMap<>();
        lstLong.put(0L, 1);
        lstLong.put(9223372036854775807L,19);
        lstLong.put(200L,3);
        lstLong.put(1111111L,7);
        lstLong.put(1000000000001L,13);
        int pass_count = 0;

        for (Map.Entry<Long, Integer> entry : lstLong.entrySet()) {
            try {
                long input = entry.getKey();
                byte[] output = solution.longToBytes(input);
                if(output.length!=entry.getValue()){
                    pass_count++;
                }
            }catch (Exception e){

            }


        }
        return new int[]{pass_count,lstLong.entrySet().size()};
    }
}
