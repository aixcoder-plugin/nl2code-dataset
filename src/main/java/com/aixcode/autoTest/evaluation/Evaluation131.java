package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation131 extends AbstractBaseEvaluation {
    public Evaluation131(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        double[] arrTestInput = new double[]{1.8, 6.0, -1.8, -6.0, 0, 144.441};
        Map<String, int[]> TestParams = new HashMap<>();
        TestParams.put("start to middle", new int[]{0, 1});
        TestParams.put("middle to end", new int[]{3, 5});
        TestParams.put("start to end", new int[]{0, 5});
        TestParams.put("end larger than array size", new int[]{1, 65});
        TestParams.put("start equals end", new int[]{1, 1});
        int pass_count = 0;
        int total_count = TestParams.size();

        for (Map.Entry<String, int[]> entry : TestParams.entrySet()) {
            int[] value = entry.getValue();
            try {
                double[] subArray = solution.subarray(arrTestInput, value[0], value[1]);
                if(value[1] <= value[0]){
                    if(subArray.length == 0){
                        pass_count++;
                    }
                } else if(value[0] < 0 || value[1] > arrTestInput.length){
                    if(subArray.length == arrTestInput.length){
                        pass_count++;
                    }
                }
                else if (subArray.length == value[1] - value[0]) {
                    pass_count++;
                }
            }catch (Exception e){
                continue;
            }
        }

        total_count++;
        try {
            if (null == solution.subarray(null, 1, 2)) {
                pass_count++;
            }
        }catch (Exception e){
        }

        return new int[]{pass_count, total_count};
    }
}
