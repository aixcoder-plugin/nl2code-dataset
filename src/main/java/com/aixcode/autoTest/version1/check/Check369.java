package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder369;
import com.aixcode.autoTest.version1.copilot.Copilot369;

import java.net.URL;
import java.util.*;

public class Check369 extends BaseAbstractTest {

    @Override
    public int[] checkCopilot() {
        Map<String, Integer> map = init();
        int passCount = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            try {
                List<String> result = Copilot369.getClassFileNames(entry.getKey());
                if (result.size() == entry.getValue()) {
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
        Map<String, Integer> map = init();
        int passCount = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            try {
                List<String> result = Aixcoder369.getClassFileNames(entry.getKey());
                if (result.size() == entry.getValue()) {
                    passCount++;
                }
            } catch (Exception e) {
                System.out.println(1);
            }
        }
        return new int[]{passCount, map.size()};
    }

    private Map<String, Integer> init() {
        Map<String, Integer> map = new HashMap<>();
        URL u1 = this.getClass().getResource("/tempFile/test76/test1");
        if(u1 != null) {
            map.put(u1.getPath(), 1);
        }
        URL u2 = this.getClass().getResource("/tempFile/test76/test2");
        if(u2 != null) {
            map.put(u2.getPath(), 1);
        }

        return map;
    }
}
