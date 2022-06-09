package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation30 extends AbstractBaseEvaluation {


    public Evaluation30(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Map<String, Object> Map1 = new HashMap<String, Object>();
        Map1.put("key1", "value1");
        Map1.put("key2", 44);
        Map1.put("key3", true);
        Map1.put("key4", 'C');

        int pass_count = 0;
        int total_count = 0;

        total_count++;
        try {
            if (solution.getEntry(Map1, "Key1").getKey().equals("Key1")) {
                pass_count++;
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        total_count++;
        try {
            if (solution.getEntry(Map1, "Key5") == null) {
                pass_count++;
            }
        } catch (Exception ex) {
            ex.getMessage();
        }

        return new int[]{pass_count, total_count};
    }
}
