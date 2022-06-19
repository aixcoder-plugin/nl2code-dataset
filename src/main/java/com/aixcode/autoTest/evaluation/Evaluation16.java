package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Double.NaN;

public class Evaluation16 extends AbstractBaseEvaluation {


    public Evaluation16(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        double[] vector = {1, 2, 3};
        double[] vector1 = {1, 2, 3, NaN};
        double[] vector2 = {1, 2, 3, NaN, NaN};
        double[] vector3 = {1, 2, 3, NaN, NaN, NaN};
        double[] vector4 = {1, 2, 3, NaN, NaN, NaN, NaN};
        double[] vector5 = {1, 2, 3, NaN, NaN, NaN, NaN, NaN};
        Map<double[], Boolean> map = new HashMap<double[], Boolean>() {{
            put(vector1, true);
            put(vector2, true);
            put(vector3, true);
            put(vector4, true);
            put(vector5, true);
        }};
        int pass_count = 0;

        for (Map.Entry<double[], Boolean> entry : map.entrySet()) {
            try {
                int size = solution.hashCode(vector);
                if ((size == solution.hashCode(entry.getKey())) == entry.getValue()) {
                    pass_count++;
                }
            } catch (Exception e) {
            }
        }

        return new int[]{pass_count, map.entrySet().size()};
    }
}
