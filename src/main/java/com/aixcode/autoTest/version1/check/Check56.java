package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder56;
import com.aixcode.autoTest.version1.copilot.Copilot56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Check56 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Map<String, String> map = init();
        int passCount = 0;

        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                String[] tmp = entry.getKey().split(" ");
                List<String> inputList = new ArrayList<>(Arrays.asList(tmp[0].split(",")));
                int start = Integer.parseInt(tmp[1]);
                int end = Integer.parseInt(tmp[2]);
                Copilot56.delete(inputList, start, end);
                String resultStr = String.join(",", inputList);
                if (resultStr.equals(entry.getValue())) {
                    passCount++;
                }
            } catch (Exception e) {
            }
        }
        return new int[]{passCount, map.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Map<String, String> map = init();
        int passCount = 0;

        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                String[] tmp = entry.getKey().split(" ");
                List<String> inputList = new ArrayList<>(Arrays.asList(tmp[0].split(",")));
                int start = Integer.parseInt(tmp[1]);
                int end = Integer.parseInt(tmp[2]);
                Aixcoder56.delete(inputList, start, end);
                String resultStr = String.join(",", inputList);
                if (resultStr.equals(entry.getValue())) {
                    passCount++;
                }
            } catch (Exception e) {
            }
        }
        return new int[]{passCount, map.size()};
    }

    private Map<String, String>  init() {
        Map<String, String> map = new java.util.HashMap<>();
        map.put("1,2,3 1 2", "1");
        map.put("a,b,c,e,1,2 0 3", "1,2");
        map.put("1,2,3 0 10", "");

        return map;
    }
}
