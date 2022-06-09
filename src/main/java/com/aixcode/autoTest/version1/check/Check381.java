package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder381;
import com.aixcode.autoTest.version1.copilot.Copilot381;

import java.util.HashMap;
import java.util.Map;

public class Check381 extends BaseAbstractTest {
    private Map<Integer, String> globalMap;
    private void initTestData() {
        this.globalMap = new HashMap<>();
        this.globalMap.put(123, "123");
        this.globalMap.put(8934, "8934");
        this.globalMap.put(0, "0");
        this.globalMap.put(32203, "32203");
        this.globalMap.put(-1, null);
    }

    @Override
    public int[] checkCopilot() {
        Copilot381 solution = new Copilot381();
        this.initTestData();
        int pass_count = 0;
        int total_count = 0;
        Map<Integer, String> removeTargetMap = new HashMap<>();
        removeTargetMap.put(123, "success");
        removeTargetMap.put(0, "success");
        removeTargetMap.put(-1, "success");
        removeTargetMap.put(89, "failed");//not existed key
        removeTargetMap.put(8934, "success");

        total_count = removeTargetMap.size();
        for (Map.Entry<Integer, String> entry : removeTargetMap.entrySet()) {
            try {
                Integer toRemoveKey = entry.getKey();
                solution.remove(this.globalMap, toRemoveKey);
                if (entry.getValue().equals("success")) {
                    if (!this.globalMap.containsKey(toRemoveKey)) {
                        pass_count++;
                    }
                }else {
                    pass_count++;
                }
            } catch (Exception e) {

            }
        }
        try {
            total_count++;
            solution.remove(null, 0);
            pass_count++;
        } catch (Exception e) {

        }

        return new int[]{pass_count,total_count};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder381 solution = new Aixcoder381();
        this.initTestData();
        int pass_count = 0;
        int total_count = 0;
        Map<Integer, String> removeTargetMap = new HashMap<>();
        removeTargetMap.put(123, "success");
        removeTargetMap.put(0, "success");
        removeTargetMap.put(-1, "success");
        removeTargetMap.put(89, "failed");//not existed key
        removeTargetMap.put(8934, "success");

        total_count = removeTargetMap.size();
        for (Map.Entry<Integer, String> entry : removeTargetMap.entrySet()) {
            try {
                Integer toRemoveKey = entry.getKey();
                solution.remove(this.globalMap, toRemoveKey);
                if (entry.getValue().equals("success")) {
                    if (!this.globalMap.containsKey(toRemoveKey)) {
                        pass_count++;
                    }
                }else {
                    pass_count++;
                }
            } catch (Exception e) {

            }
        }
        try {
            total_count++;
            solution.remove(null, 0);
            pass_count++;
        } catch (Exception e) {

        }

        return new int[]{pass_count,total_count};
    }
}
