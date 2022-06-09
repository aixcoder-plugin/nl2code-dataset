package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation151 extends AbstractBaseEvaluation {
    public Evaluation151(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {

        Map<int[], Integer[]> mTest = new HashMap<>();
        mTest.put(new int[]{1, 2, 3}, new Integer[]{1, 2, 3});
        mTest.put(new int[10], new Integer[]{0,0,0,0,0,0,0,0,0,0});
        mTest.put(new int[0], new Integer[0]);
        mTest.put(new int[]{1,1,1,1,1,1}, new Integer[]{1,1,1,1,1,1});

        int pass_count = 0;
        int total_count = 0;

        for (Map.Entry<int[], Integer[]> arrBB : mTest.entrySet()) {
            int[] source = arrBB.getKey();
            Integer[] result = arrBB.getValue();
            Integer[] actualReturn;
            try {
                total_count++;
                actualReturn = solution.asObjectArray(source);
                boolean isEqual = true;
                if (actualReturn.length == result.length){
                    for(int i=0; i < actualReturn.length; i++){
                        if (!actualReturn[i].equals(result[i])){
                            isEqual = false;
                            break;
                        }
                    }
                    if(isEqual){
                        pass_count++;
                    }
                }
            }
            catch (Exception e) {
            }
        }

        try {
            total_count++;
            Integer[] actualReturn = solution.asObjectArray(null);
            if (actualReturn == null){
                pass_count++;
            }
        }
        catch (Exception e) {
        }

        return new int[]{pass_count, total_count};
    }
}
