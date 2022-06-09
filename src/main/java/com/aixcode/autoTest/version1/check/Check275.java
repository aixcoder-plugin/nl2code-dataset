package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder275;
import com.aixcode.autoTest.version1.copilot.Copilot275;

import java.util.*;

public class Check275 extends BaseAbstractTest {

    @Override
    public int[] checkCopilot() {
        Map<List<Integer>, Integer> map = init();
        int passCount = 0;

        for (Map.Entry<List<Integer>, Integer> entry : map.entrySet()) {
            try {
                int result = Copilot275.getDaysInMonth(entry.getKey().get(0), entry.getKey().get(1));
                if (result == entry.getValue()) {
                    passCount++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new int[]{passCount, map.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Map<List<Integer>, Integer> map = init();
        int passCount = 0;

        for (Map.Entry<List<Integer>, Integer> entry : map.entrySet()) {
            try {
                int result = Aixcoder275.getDaysInMonth(entry.getKey().get(0), entry.getKey().get(1));
                if (result == entry.getValue()) {
                    passCount++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new int[]{passCount, map.size()};
    }

    private Map<List<Integer>, Integer> init() {
        Map<List<Integer>, Integer> map = new HashMap<>();
        List<Integer> input = new ArrayList<>();
        input.add(2022);
        input.add(2);
        map.put(input, 28);
        List<Integer> input1 = new ArrayList<>();
        input1.add(2020);
        input1.add(2);
        map.put(input1, 29);
        List<Integer> input2 = new ArrayList<>();
        input2.add(2020);
        input2.add(12);
        map.put(input2, 31);

        return map;
    }
}
