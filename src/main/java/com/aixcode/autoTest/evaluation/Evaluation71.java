package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Evaluation71 extends AbstractBaseEvaluation {


    public Evaluation71(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    private Map<String, Long> init() {
        Map<String, Long> map = new HashMap<>();
        map.put("1", 2212294583L);
        map.put("2", 450215437L);

        return map;
    }

    @Override
    public int[] evaluation() {
        Map<String, Long> map = init();
        int passCount = 0;

        for (Map.Entry<String, Long> entry : map.entrySet()) {
            try {
                byte[] bytes = entry.getKey().getBytes(StandardCharsets.UTF_8);
                long result = solution.crc32(bytes);
                if (result == entry.getValue()) {
                    passCount++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new int[]{passCount, map.size()};
    }
}
