package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation127 extends AbstractBaseEvaluation {

    public Evaluation127(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        Map<int[], Integer> map = new HashMap<>(){{
            put(new int[]{1,2},1);
            put(new int[]{1,3},2);
            put(new int[]{1,4},3);
            put(new int[]{1,5},4);
            put(new int[]{1,6},6);
        }};
        for (Map.Entry<int[],Integer> entry : map.entrySet()){
            try {
                int[] arr = solution.range(entry.getKey()[0], entry.getKey()[1]);
                int endValue = entry.getValue();
                boolean bool = false;
                if (null != arr && arr.length > 0){
                    if (arr[arr.length - 1] == endValue){
                        if (endValue < entry.getKey()[1]){
                            pass_count++;
                        }
                    }else{
                        if (arr[arr.length - 1] < endValue){
                            pass_count++;
                        }
                        if (arr[arr.length-1] > endValue){
                            pass_count++;
                        }
                    }
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }
}
