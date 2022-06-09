package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation182 extends AbstractBaseEvaluation {
    public Evaluation182(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Map<String[], String[]> testData = new HashMap<>();
        testData.put(new String[]{"1 7", "6", "tr_ue"}, new String[]{"17", "6", "true"});
        testData.put(new String[]{"1,7", "6 ", "tr?ue"}, new String[]{"17", "6", "true"});
        testData.put(new String[]{" 17 ", " 6 ", " true "}, new String[]{"17", "6", "true"});
        testData.put(new String[]{" ?.,  "}, new String[]{""});
        testData.put(new String[]{"This is test sample!"}, new String[]{"Thisistestsample"});

        int pass_count = 0;
        int total_count = 0;

        for (Map.Entry<String[], String[]> arrBB : testData.entrySet()) {
            String[] keyStr = arrBB.getKey();
            String[] result = arrBB.getValue();
            String[] actualReturn;
            try {
                total_count++;
                actualReturn = solution.filter(keyStr);
                boolean isSame = true;
                if(actualReturn.length != result.length) {
                    isSame = false;
                }else {
                    for (int i = 0; i < actualReturn.length; i++) {
                        if (!actualReturn[i].equals(result[i])) {
                            isSame = false;
                            break;
                        }
                    }
                }
                if (isSame) {
                    pass_count++;
                }
            } catch (Exception e) {
            }
        }

        try {
            total_count++;
            String[] actualReturn = solution.filter(null);
            if (actualReturn == null) {
                pass_count++;
            }
        } catch (Exception e) {
        }

        return new int[]{pass_count, total_count};
    }
}
