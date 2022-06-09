package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder82;
import com.aixcode.autoTest.version1.copilot.Copilot82;

import java.util.*;

public class Check82 extends BaseAbstractTest {

    @Override
    public int[] checkCopilot() {
        Map<String, String> map = init();

        int passCount = 0;

        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                String[] tmp = entry.getKey().split(" ");
                ArrayList<String> input1 = new ArrayList<String>(Arrays.asList(tmp[0].split(",")));
                ArrayList<String> input2 = new ArrayList<String>(Arrays.asList(tmp[1].split(",")));
                ArrayList<String> result = Copilot82.merge(input1, input2);
                String resultStr = String.join(",", result);
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
                ArrayList<String> input1 = convert2List(tmp[0]);
                ArrayList<String> input2 = convert2List(tmp[1]);
                ArrayList<String> result = Aixcoder82.merge(input1, input2);
                String resultStr = String.join(",", result);
                if (resultStr.equals(entry.getValue())) {
                    passCount++;
                }
            } catch (Exception e) {
                System.out.println(1);
            }
        }
        return new int[]{passCount, map.size()};
    }

    private Map<String, String> init() {
        Map<String, String> map = new HashMap<>();
        map.put("1,2,3 3,4,5", "1,2,3,4,5");
        map.put("1,4,5 1,4,5", "1,4,5");
        map.put("a,b,c a", "a,b,c");
        map.put(" a,b,c", "a,b,c");
        return map;
    }

    private ArrayList<String> convert2List(String str) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : str.split(",")) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }
        return list;
    }
}
