package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation52 extends AbstractBaseEvaluation {
    private Map<Integer, String> globalMap;
    private void initTestData() {
        this.globalMap = new HashMap<>();
        this.globalMap.put(123, "123");
        this.globalMap.put(8934, "8934");
        this.globalMap.put(0, "0");
        this.globalMap.put(32203, "32203");
        this.globalMap.put(-1, null);
    }

    public Evaluation52(String basePackage, String prefix) {
        super(basePackage, prefix);
        initTestData();
    }

    @Override
    public int[] evaluation() {
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
