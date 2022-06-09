package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;


public class Evaluation22 extends AbstractBaseEvaluation {


    public Evaluation22(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_cunt = 0 ;
        try {
            String date = solution.readImageData("autoTest.png");
            if (null != date && date.length() > 0){
                pass_cunt ++;
            }
        }catch (Exception e) {

        }
        return new int[] {pass_cunt,1};
    }
}
