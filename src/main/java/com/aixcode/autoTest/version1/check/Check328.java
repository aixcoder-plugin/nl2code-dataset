package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder328;
import com.aixcode.autoTest.version1.copilot.Copilot328;

import java.io.FileInputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Check328 extends BaseAbstractTest {

    @Override
    public int[] checkCopilot() {
        Map<String, Boolean> map = init();
        int passCount = 0;

        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            try {
                FileInputStream result = Copilot328.openFile(entry.getKey());
                boolean isRead = result != null;
                if (isRead == entry.getValue()) {
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
        Map<String, Boolean> map = init();
        int passCount = 0;

        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            try {
                FileInputStream result = Aixcoder328.openFile(entry.getKey());
                boolean isRead = result != null;
                if (isRead == entry.getValue()) {
                    passCount++;
                }
            } catch (Exception e) {
                System.out.println(1);
            }
        }
        return new int[]{passCount, map.size()};
    }

    private Map<String, Boolean> init() {
        Map<String, Boolean> map = new HashMap<>();
        URL u1 = this.getClass().getResource("/328/autoTest.txt");
        if (u1 != null) {
            map.put(u1.getPath(), true);
        }
        map.put("no_such_file.txt", false);

        return map;
    }
}
