package com.aixcode.autoTest.evaluation;



import com.aixcode.autoTest.AbstractBaseEvaluation;
import com.aixcode.sampleHelper.Male;

import java.util.List;

public class Evaluation181 extends AbstractBaseEvaluation {
    public Evaluation181(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int passCount = 0;
        try {
            List<Class> list=solution.getClassGenricType(Male.class);
            if (list!=null&&list.size()==2&&list.contains(String.class)&&list.contains(Integer.class)){
                passCount++;
            }
        }catch (Exception e){

        }
        return new int[]{passCount,1};
    }

}
