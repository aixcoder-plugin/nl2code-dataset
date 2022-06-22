package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;
import com.aixcode.autoTest.Executor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Evaluation95 extends AbstractBaseEvaluation {
    List<Object> values = new ArrayList<>(Arrays.asList(
            new Object[]{21, 5, 2, -1, 1},
            "new Object[]{0}",
            12,
            false,
            new Executor()
    ));
    List<Object> values2 = new ArrayList<>(Arrays.asList(
            new Object[]{21, 5, 2, -1, 1},
            "new Object[]",
            15,
            false,
            new Executor()
    ));
    List<Boolean> values3 = new ArrayList<>(Arrays.asList(
            true,
            false,
            false,
            true,
            true
    ));

    public Evaluation95(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int passCount=0;
        for (int i=0;i<values.size();i++){
            Object value=values.get(i);
            Object value2=values2.get(i);
            Boolean value3=values3.get(i);
            try {
                if (solution.equals(value,value2)==value3){
                    passCount++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,values.size()};
    }
}
