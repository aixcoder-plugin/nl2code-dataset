package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

public class Evaluation31 extends AbstractBaseEvaluation {


    public Evaluation31(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int[] arrTest = {-33,0,663};
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
        total_count++;
        try{
            if(solution.indexOf(arrTest2, 12) == 0){
                pass_count++;
            }
        }catch(Exception e){
        }

        // for not found, return -1
        try {
            total_count++;
            if(solution.indexOf(new int[]{}, 100) == -1) {
                pass_count++;
            }
        }catch (Exception e){
        }

        // for null input, return -1
        try {
            total_count++;
            if(solution.indexOf(null, -1) == -1) {
                pass_count++;
            }
        }catch (Exception e){}

        return new int[]{pass_count,total_count};
    }
}
