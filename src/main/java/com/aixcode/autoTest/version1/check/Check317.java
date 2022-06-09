package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder317;
import com.aixcode.autoTest.version1.copilot.Copilot317;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Double.NaN;

public class Check317 extends BaseAbstractTest {
    private Map<Double, double[]> globalMap;
    public static final double POSITIVE_INFINITY = 1.0 / 0.0;
    public Check317() {
        this.globalMap = new HashMap<>();
        this.globalMap.put(34.538776394910684, new double[]{1E4, 1E5, 1E6});
        this.globalMap.put(-POSITIVE_INFINITY, new double[]{2.0235E-6, 0.0, 2.374958E10});//has 0
        this.globalMap.put(-2.0794415416798357, new double[]{2.0, 0.5, 0.125});
        this.globalMap.put(NaN, new double[]{-10,8E10});//has negative value
    }

    @Override
    public int[] checkCopilot() {
        Copilot317 solution = new Copilot317();
        int pass_count = 0;
        int total_count = this.globalMap.size();;

        for (Map.Entry<Double, double[]> entry : this.globalMap.entrySet()) {
            try {
                Double logValue = solution.logSum(entry.getValue());
                if (logValue.isInfinite() && entry.getKey().isInfinite()) {
                    pass_count++;
                }else if (logValue.isNaN() && entry.getKey().isNaN()){
                    pass_count++;
                }
                else if (entry.getKey() - logValue < 0.0001){
                    pass_count++;
                }
            } catch (Exception e) {

            }
        }
        try {
            total_count++;
            solution.logSum(null);
            pass_count++;
        } catch (Exception e) {
        }

        try {
            total_count++;
            solution.logSum(new double[0]);
            pass_count++;
        } catch (Exception e) {
        }

        return new int[]{pass_count,total_count};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder317 solution = new Aixcoder317();

        int pass_count = 0;
        int total_count = this.globalMap.size();;

        for (Map.Entry<Double, double[]> entry : this.globalMap.entrySet()) {
            try {
                Double logValue = solution.logSum(entry.getValue());
                if (logValue.isInfinite() && entry.getKey().isInfinite()) {
                    pass_count++;
                }else if (logValue.isNaN() && entry.getKey().isNaN()){
                    pass_count++;
                }
                else if (entry.getKey() - logValue < 0.0001){
                    pass_count++;
                }
            } catch (Exception e) {

            }
        }
        try {
            total_count++;
            solution.logSum(null);
            pass_count++;
        } catch (Exception e) {
        }
        try {
            total_count++;
            solution.logSum(new double[0]);
            pass_count++;
        } catch (Exception e) {
        }
        return new int[]{pass_count,total_count};
    }
}
