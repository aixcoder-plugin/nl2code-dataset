package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

public class Evaluation94 extends AbstractBaseEvaluation {

    public int[][] values = new int[][] {
            {21, 5, 2, -1, 1},
            {0},
            {-1,-1},
            {2,-12},
            {62, 2, -10, -2, 1, 2, -10, 1}
    };

    public Evaluation94(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int passCount=0;
        for (int i=0;i<values.length;i++){
            int[] value=values[i];
            try {
                int res=solution.random(value);
                for (int v:value) {
                    if (v==res){
                        passCount++;
                        break;
                    }
                }

            }catch (Exception e){
            }
        }
        return new int[]{passCount,values.length};
    }
}
