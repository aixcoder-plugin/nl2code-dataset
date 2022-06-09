package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Evaluation148 extends AbstractBaseEvaluation {
    public Evaluation148(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {

        List<String> targetList = new ArrayList<>();
        targetList.add("t01");
        targetList.add("t02");
        targetList.add("t03");
        targetList.add("t04");
        targetList.add("t05");
        targetList.add("t06");
        targetList.add("t01");
        targetList.add("t07");
        targetList.add("t08");
        targetList.add("t09");

        Map<String, int[]> mTest = new HashMap<>();
        mTest.put("t03", new int[]{1, 2});
        mTest.put("t07", new int[]{8, 7});
        mTest.put("t01", new int[]{0, 6});
        mTest.put("t04", new int[]{3, 3});
        mTest.put("t05", new int[]{4, 10});
        mTest.put("t09", new int[]{9, -1});

        int pass_count = 0;
        int total_count = 0;

        for (Map.Entry<String, int[]> arrBB : mTest.entrySet()) {
            String ExpectValue = arrBB.getKey();
            int[] testIndex = arrBB.getValue();
            try {
                total_count++;
                solution.swap(targetList, testIndex[0], testIndex[1]);
                if (targetList.get(testIndex[0]).equals(ExpectValue)) {
                    pass_count++;
                }else {
                    System.out.println("Fail: " + targetList.get(testIndex[0]) + " != " + ExpectValue);
                }
            }
            catch (Exception e) {
            }
        }

        try {
            total_count++;
            solution.swap(null, 1,2);
            pass_count++;
        }
        catch (Exception e) {
        }

        return new int[]{pass_count, total_count};
    }
}
