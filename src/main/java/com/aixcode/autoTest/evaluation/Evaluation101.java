package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Evaluation101 extends AbstractBaseEvaluation {
    public List<int[]> arrList=new ArrayList<>(5){
        {
            add(new int[]{1,2,3});
            add(new int[3]);
            add(new int[]{7});
            add(new int[]{8,8});
            add(new int[]{5,8,2,5,8,2});
        }
    };

    public Evaluation101(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        for(int[] arr:arrList){
            try{
                int[] result = solution.copy(arr);
                if(Arrays.equals(result,(arr))&&result!=arr){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,arrList.size()};
    }
}
