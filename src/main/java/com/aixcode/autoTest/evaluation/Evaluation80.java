package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

public class Evaluation80 extends AbstractBaseEvaluation {
    public static int[][] data=new int[][]{
        {1,20},
        {2,100},
        {3,4},
        {4,4},
        {5,10}
    };

    public Evaluation80(String basePackage, String prefix) {
        super(basePackage, prefix);
    }


    @Override
    public int[] evaluation() {
        int passCount=0;
        for (int i=0;i<data.length;i++){
            int[] d=data[i];
            int origin=d[0];
            int bound=d[1];
            try {
                int res=solution.randomInt(origin, bound);
                if (res>=origin&&res<bound){
                    passCount+=1;
                }
            }catch (Exception e){

            }

        }
        return new int[]{passCount,data.length};
    }
}
