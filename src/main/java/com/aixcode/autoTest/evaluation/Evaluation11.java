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
        int[] arr1 = {1,2,3,4,5};//sorted small to big
        int[] arr2 = {6,5,4,3,2,1};//sorted big to small
        int[] arr3 = {3,3,3,3,3,3};
        int[] arr4 = {1};//one element
        int[] arr5 = {};//empty
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
                if(!isSorted(arr)){
                    pass_count++;
                }
            }catch (Exception e) {
            }
        }
        return new int[]{pass_count, map.size()};
    }

    private boolean isSorted(int[] arr){
        boolean isSorted = true;
        if (arr.length > 1){
            for (int i = 0; i < arr.length - 2; i++){
                if (arr[i] > arr[i+1]){
                    isSorted = false;
                    break;
                }
            }
        }else if (arr.length == 1){
            isSorted = false;
        }

        boolean isAll3 = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 3) {
                isSorted = false;
                break;
            }
        }
        if(isAll3){
            isSorted = false;
        }

        return isSorted;
    }
}
