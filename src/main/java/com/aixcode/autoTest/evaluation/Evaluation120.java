package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation120 extends AbstractBaseEvaluation {

    public Evaluation120(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        Map<double[],Integer> map = new HashMap<>(){{
            put(new double[] {1000000.675d,Double.NaN},-1);// NaN is lager than all double values, including PositiveInfinity
            put(new double[] {Double.NaN,Double.NaN},0);//NaN is equal to NaN
            put(new double[] {Double.NaN,Double.POSITIVE_INFINITY},1);//// NaN is lager than all double values, including PositiveInfinity
            put(new double[]{+0.0d,-0,0d}, 1);// +0.0d is larger than -0.0d
            put(new double[] {123.567d, 123.567d}, 0); // normal double values compare
            put(new double[] {-123.321d, Double.NEGATIVE_INFINITY}, 1);// negative double value larger than negative infinity
            put(new double[] {123.009d, Double.POSITIVE_INFINITY}, -1);// positive double value smaller than positive infinity
        }};
        for (Map.Entry<double[], Integer> entry : map.entrySet()){
            try {
                if (solution.compare(entry.getKey()[0],entry.getKey()[1])==entry.getValue()){
                    pass_count++;
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }
}
