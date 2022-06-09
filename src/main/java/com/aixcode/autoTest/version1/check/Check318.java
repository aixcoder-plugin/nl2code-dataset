package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder318;
import com.aixcode.autoTest.version1.copilot.Copilot318;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class Check318 extends BaseAbstractTest {

    @Override
    public int[] checkCopilot() {
        Map<String, Long> map = init();
        int passCount = 0;

        for (Map.Entry<String, Long> entry : map.entrySet()) {
            try {
                byte[] bytes = entry.getKey().getBytes(StandardCharsets.UTF_8);
                long result = Copilot318.crc32(bytes);
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
        Map<String, Long> map = init();
        int passCount = 0;

        for (Map.Entry<String, Long> entry : map.entrySet()) {
            try {
                byte[] bytes = entry.getKey().getBytes(StandardCharsets.UTF_8);
                long result = Aixcoder318.crc32(bytes);
                if (result == entry.getValue()) {
                    passCount++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new int[]{passCount, map.size()};
    }

    private Map<String, Long> init() {
        Map<String, Long> map = new HashMap<>();
        map.put("1", 2212294583L);
        map.put("2", 450215437L);

        return map;
    }
}
