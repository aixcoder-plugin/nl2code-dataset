package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

public class Evaluation132 extends AbstractBaseEvaluation {
    public Evaluation132(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        String[] arrTestInput = new String[]{"xx分钟前", "今天 11:53", "07月09日 13:36", "2010-09-23 19:55:38", "", null};
        int pass_count = 0;
        for(String input : arrTestInput) {
            String output = null;
            try {
                output = solution.parseDate(input);
                if(input == null || input.equals("")){
                    if(output == input){
                        pass_count++;
                    }
                }
                else if(output.length() == 14) {
                    pass_count++;
                }
            } catch (Exception e) {
            }
        }

        return new int[]{pass_count,arrTestInput.length};
    }
}
