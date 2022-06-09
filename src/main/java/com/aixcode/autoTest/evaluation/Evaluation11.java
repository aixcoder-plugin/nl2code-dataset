package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation11 extends AbstractBaseEvaluation {


    public Evaluation11(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5,6};
        int[] arr3 = {1,2,3,4,5,6,7};
        int[] arr4 = {1,2,3,4,5,6,7,8};
        int[] arr5 = {1,2,3,4,5,6,7,8,9};
        Map<int[], Integer> map = new HashMap<int[], Integer>(){{
            put(arr1,5);
            put(arr2, 6);
            put(arr3, 7);
            put(arr4, 8);
            put(arr5, 9);
        }};
        int pass_count = 0;
        for (Map.Entry<int[], Integer> entry : map.entrySet()){
            try {
                int[] arr = entry.getKey();
                solution.shuffle(arr);
                for (int i = 0 ; i < entry.getValue(); i++){
                    if ( arr[i] != (i+1) ){
                        pass_count++;
                        break;
                    }
                }
            }catch (Exception e) {
            }
        }
        return new int[]{pass_count, map.size()};
    }
}
