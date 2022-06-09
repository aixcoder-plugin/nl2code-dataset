package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder372;
import com.aixcode.autoTest.version1.copilot.Copilot372;

import java.lang.reflect.Field;
import java.util.*;

public class Check372 extends BaseAbstractTest {
    private Map<String, Object> sourceMap = new HashMap<>();
    public Check372() {
        sourceMap.put("Date.java", new Date());
        sourceMap.put("exception", new Exception("haha"));
        sourceMap.put("String", new StringBuilder("test"));
        sourceMap.put("array", Calendar.getInstance());
        sourceMap.put("", new HashMap<>());
    }
    @Override
    public int[] checkCopilot() {
        Copilot372 solution=new Copilot372();
        int pass_count = 0;
        int total_count = sourceMap.size();

        for(Map.Entry<String, Object> entry : sourceMap.entrySet()) {
            String expectedFName = entry.getKey();
            try {
                List<Field> res = solution.getFields(entry.getValue().getClass());
                if (res != null) {
                    pass_count++;
                }
            } catch (Exception e) {
                continue;
            }
        }
        try {
            total_count++;
            solution.getFields(null);
            pass_count++;
        }catch (Exception e) {

        }

        return new int[]{pass_count,total_count};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder372 solution = new Aixcoder372();
        int pass_count = 0;
        int total_count = sourceMap.size();

        for(Map.Entry<String, Object> entry : sourceMap.entrySet()) {
            String expectedFName = entry.getKey();
            try {
                List<Field> res = solution.getFields(entry.getValue().getClass());
                if (res != null) {
                    pass_count++;
                }

            } catch (Exception e) {
                continue;
            }
        }
        try {
            total_count++;
            solution.getFields(null);
            pass_count++;
        }catch (Exception e) {

        }
        return new int[]{pass_count,total_count};

    }
}
