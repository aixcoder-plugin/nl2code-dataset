package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder93;
import com.aixcode.autoTest.version1.copilot.Copilot93;

import java.util.HashMap;
import java.util.Map;

public class Check93 extends BaseAbstractTest {

    @Override
    public int[] checkCopilot() {
        Map<Class, Class> map = init();
        int passCount = 0;

        for (Map.Entry<Class, Class> entry : map.entrySet()) {
            try {
                Object result = Copilot93.newInstance(entry.getKey());
                if (result.getClass() == entry.getValue()) {
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
        Map<Class, Class> map = init();
        int passCount = 0;

        for (Map.Entry<Class, Class> entry : map.entrySet()) {
            try {
                Object result = Aixcoder93.newInstance(entry.getKey());
                if (result.getClass() == entry.getValue()) {
                    passCount++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new int[]{passCount, map.size()};
    }

    private Map<Class, Class> init() {
        Map<Class, Class> map = new HashMap<>();
        map.put(String.class, String.class);
        map.put(Check93.class, Check93.class);

        return map;
    }
}
