package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder124;
import com.aixcode.autoTest.version1.copilot.Copilot124;

import java.util.HashMap;
import java.util.Map;

public class Check124 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot124 solution=new Copilot124();
        Map<Integer, String> testData = new HashMap<>();
        testData.put(1, ""); // index larger than the size of the array
        testData.put(-1, ""); // index less than 0
        testData.put(0, "a"); // index 0
        testData.put(2, "cba"); // index 1
        testData.put(4, "AABB\n"); //index 3 is not normal chars
        testData.put(10, "12345678cbaKLSJ"); // index 1


        int pass_count = 0;
        int total_count = 0;

        for (Map.Entry<Integer, String> entry : testData.entrySet()) {
            total_count++;
            int index = entry.getKey();
            StringBuffer input = new StringBuffer(entry.getValue());
            try {
                char res = solution.getChar(input, index);
                if(entry.getValue().equals("AABB\n")){
                    if(res=='\n'){
                        pass_count++;
                    }
                }
                else if (entry.getValue().equals("")) {
                    if(res == '\0') {
                        pass_count++;
                    }
                }
                else{
                    if(res=='a'){
                        pass_count++;
                    }
                }
            }
            catch (Exception e) {
                continue;
            }
        }

        return new int[]{pass_count,total_count};

    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder124 solution=new Aixcoder124();
        Map<Integer, String> testData = new HashMap<>();
        testData.put(1, ""); // index larger than the size of the array
        testData.put(-1, ""); // index less than 0
        testData.put(0, "a"); // index 0
        testData.put(2, "cba"); // index 1
        testData.put(4, "AABB\n"); //index 3 is not normal chars
        testData.put(10, "12345678cbaKLSJ"); // index 1


        int pass_count = 0;
        int total_count = 0;

        for (Map.Entry<Integer, String> entry : testData.entrySet()) {
            total_count++;
            int index = entry.getKey();
            StringBuffer input = new StringBuffer(entry.getValue());
            try {
                char res = solution.getChar(input, index);
                if(entry.getValue().equals("AABB\n")){
                    if(res=='\n'){
                        pass_count++;
                    }
                }
                else if (entry.getValue().equals("")) {
                    if(res == '\0') {
                        pass_count++;
                    }
                }
                else{
                    if(res=='a'){
                        pass_count++;
                    }
                }
            }
            catch (Exception e) {
                continue;
            }
        }

        return new int[]{pass_count,total_count};

    }
}
