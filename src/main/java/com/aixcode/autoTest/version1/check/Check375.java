package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder375;
import com.aixcode.autoTest.version1.copilot.Copilot375;

import java.util.HashMap;
import java.util.Map;

public class Check375 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot375 solution=new Copilot375();
        Map<Long, Integer> lstLong=new HashMap<>();
        lstLong.put(0L, 1);
        lstLong.put(9223372036854775807L,19);
        lstLong.put(200L,3);
        lstLong.put(1111111L,7);
        lstLong.put(1000000000001L,13);
        int pass_count = 0;

        for (Map.Entry<Long, Integer> entry : lstLong.entrySet()) {
            long input = entry.getKey();
            byte[] output = solution.longToBytes(input);
            if(output.length!=entry.getValue()){
                pass_count++;
            }else {
                System.out.println("input:"+input+" output:"+output);
            }

        }
        return new int[]{pass_count,lstLong.entrySet().size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder375 solution=new Aixcoder375();
        Map<Long, Integer> lstLong=new HashMap<>();
        lstLong.put(0L, 1);
        lstLong.put(9223372036854775807L,19);
        lstLong.put(200L,3);
        lstLong.put(1111111L,7);
        lstLong.put(1000000000001L,13);
        int pass_count = 0;

        for (Map.Entry<Long, Integer> entry : lstLong.entrySet()) {
            long input = entry.getKey();
            byte[] output = solution.longToBytes(input);
            if(output.length!=entry.getValue()){
                pass_count++;
            }else {
                System.out.println("input:"+input+" output:"+output);
            }

        }
        return new int[]{pass_count,lstLong.entrySet().size()};
    }
}
