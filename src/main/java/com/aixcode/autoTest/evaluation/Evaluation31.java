package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

public class Evaluation31 extends AbstractBaseEvaluation {


    public Evaluation31(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int[] arrTest = {10,20,33,322,404,515,663,774,288,199};
        int[] arrTest2 = {12,12,12,12,12};

        int pass_count = 0;
        int total_count = 0;

        for(int i = 0; i < arrTest.length; i++){
            total_count++;
            try{
                if(solution.indexOf(arrTest, arrTest[i]) == i){
                    pass_count++;
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        // {12,12,12,12,12} return index should be 0 for the first occurance
        for(int i = 0; i < arrTest2.length; i++){
            total_count++;
            try{
                if(solution.indexOf(arrTest2, arrTest2[i]) == 0){
                    pass_count++;
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        // for not found, return -1
        try {
            total_count++;
            if(solution.indexOf(arrTest, 100) == -1) {
                pass_count++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        // for null input, return -1
        try {
            total_count++;
            if(solution.indexOf(null, -1) == -1) {
                pass_count++;
            }
        }catch (Exception e){
        }

        return new int[]{pass_count,total_count};
    }
}
