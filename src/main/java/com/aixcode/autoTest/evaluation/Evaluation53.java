package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation53 extends AbstractBaseEvaluation {
    private Map<String, int[]> globalMap;

    public Evaluation53(String basePackage, String prefix) {
        super(basePackage, prefix);
        this.globalMap = new HashMap<>();
        this.globalMap.put("normal1", new int[]{1});
        this.globalMap.put("normal2", new int[]{11111,22222,33333,44444,55555,66666,77777,88888,99999});
        this.globalMap.put("normal3", new int[10]);
        this.globalMap.put("empty", new int[0]);
        this.globalMap.put("null", null);
    }


    @Override
    public int[] evaluation() {
        int pass_count = 0;
        for(Map.Entry<String, int[]> testRow : this.globalMap.entrySet()) {
            String key = testRow.getKey();
            try {
                Integer[] res = solution.toObjectArray(testRow.getValue());
                boolean isSame = true;

                if (key.startsWith("normal")) {
                    for (int i = 0; i < res.length; i++) {
                        if (res[i] != testRow.getValue()[i]) {
                            isSame = false;
                            break;
                        }
                    }
                    if (isSame) {
                        pass_count++;
                    }
                } else if (key.startsWith("empty")) {
                    if (res.length == 0) {
                        pass_count++;
                    }
                } else if (key.startsWith("null")) {
                    if (res == null) {
                        pass_count++;
                    }
                }
            } catch (Exception e) {

            }

        }
        return new int[]{pass_count,this.globalMap.size()};
    }
}
