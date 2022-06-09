package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder389;
import com.aixcode.autoTest.version1.copilot.Copilot389;

import java.util.HashMap;
import java.util.Map;

public class Check389 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot389 solution=new Copilot389();
        Map<Integer, byte[]> test_case_map = new HashMap<>();
        test_case_map.put(0, new byte[]{0,0,0,0});
        test_case_map.put(1, new byte[]{1,0,0,0});
        test_case_map.put(-1, new byte[]{-1,-1,-1,-1});
        test_case_map.put(256, new byte[]{0,1,0,0});
        test_case_map.put(65536, new byte[]{0,0,1,0});
        test_case_map.put(16777216, new byte[]{0,0,0,1});
        int pass_count = 0;
        for (Map.Entry<Integer, byte[]> entry : test_case_map.entrySet()) {
            int input = entry.getKey();
            boolean isSame = true;
            try{
                byte[] output = solution.intToByteArray(input);
                //byte[] tmp = intToByteArray(input);
                for(int i=0;i<output.length;i++) {
                    if(output[i]!=entry.getValue()[i]){
                        isSame = false;
                        break;
                    }
                }
                if(isSame) {
                    pass_count++;
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        return new int[]{pass_count, test_case_map.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder389 solution=new Aixcoder389();
        Map<Integer, byte[]> test_case_map = new HashMap<>();
        test_case_map.put(0, new byte[]{0,0,0,0});
        test_case_map.put(1, new byte[]{1,0,0,0});
        test_case_map.put(-1, new byte[]{-1,-1,-1,-1});
        test_case_map.put(256, new byte[]{0,1,0,0});
        test_case_map.put(65536, new byte[]{0,0,1,0});
        test_case_map.put(16777216, new byte[]{0,0,0,1});
        int pass_count = 0;
        for (Map.Entry<Integer, byte[]> entry : test_case_map.entrySet()) {
            int input = entry.getKey();
            boolean isSame = true;
            try{
                byte[] output = solution.intToByteArray(input);
                //byte[] tmp = intToByteArray(input);
                for(int i=0;i<output.length;i++) {
                    if(output[i]!= entry.getValue()[i]){
                        isSame = false;
                        break;
                    }
                }
                if(isSame) {
                    pass_count++;
                }
            }catch (Exception e){    }

        }
        return new int[]{pass_count, test_case_map.size()};
    }
}
