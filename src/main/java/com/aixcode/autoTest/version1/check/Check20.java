package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder20;
import com.aixcode.autoTest.version1.copilot.Copilot20;

import java.util.*;

public class Check20 extends BaseAbstractTest {

    @Override
    public int[] checkCopilot() {
        Map<ArrayList<String>, String> map = init();
        int passCount = 0;

        for (Map.Entry<ArrayList<String>, String> entry : map.entrySet()) {
            try {
                String result = Copilot20.removeLast(entry.getKey());
                if (result == null && entry.getValue() == null) {
                    passCount++;
                } else if (result.equals(entry.getValue())) {
                    passCount++;
                }
            } catch (Exception e) {
                System.out.println(1);
            }
        }
        return new int[]{passCount, map.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Map<ArrayList<String>, String> map = init();
        int passCount = 0;

        for (Map.Entry<ArrayList<String>, String> entry : map.entrySet()) {
            try {
                String result = Aixcoder20.removeLast(entry.getKey());
                if (result == null && entry.getValue() == null) {
                    passCount++;
                } else if (result.equals(entry.getValue())) {
                    passCount++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new int[]{passCount, map.size()};
    }

    private Map<ArrayList<String>, String> init() {
        Map<ArrayList<String>, String> map = new HashMap<>();
        ArrayList<String> input1 = new ArrayList<>();
        input1.add("a");
        input1.add("b");
        map.put(input1, "b");
        ArrayList<String> input2 = new ArrayList<>();
        map.put(input2, null);
        ArrayList<String> input3 = new ArrayList<>();
        input3.add("a");
        map.put(input3, "a");
        return map;
    }
}
