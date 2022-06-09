package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Evaluation149 extends AbstractBaseEvaluation {
    public Evaluation149(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {

        Map<Point[], Float> mTest = new HashMap<>();
        mTest.put(new Point[]{new Point(1,0), new Point(1, 1)}, 1.5707964f);
        mTest.put(new Point[]{new Point(0,0), new Point(1, 1)}, 0.7853982f);
        mTest.put(new Point[]{new Point(0,0), new Point(1, 0)}, 0.0f);
        mTest.put(new Point[]{new Point(1,0), new Point(-1, 0)}, 3.1415927f);
        mTest.put(new Point[]{new Point(1,0), new Point(1, 0)}, 0.0f);

        int pass_count = 0;
        int total_count = 0;

        for (Map.Entry<Point[], Float> arrBB : mTest.entrySet()) {
            Point[] source = arrBB.getKey();
            Float result = arrBB.getValue();
            Float actualReturn;
            try {
                total_count++;
                actualReturn = solution.getRadian(source[0], source[1]);

                if(source[0].equals(source[1]) &&(actualReturn == 0.0f || Float.isNaN(actualReturn))) {
                    pass_count++;
                    continue;
                }
                if (actualReturn.equals(result)){
                    pass_count++;
                }
            }
            catch (Exception e) {
            }
        }

        try {
            total_count++;
            Float actualReturn = solution.getRadian(null, null);
            if (actualReturn == null){
                pass_count++;
            }
        }
        catch (Exception e) {
        }

        return new int[]{pass_count, total_count};
    }
}
