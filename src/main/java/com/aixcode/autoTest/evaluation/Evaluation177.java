package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.lang.management.ManagementFactory;

public class Evaluation177 extends AbstractBaseEvaluation {
    public Evaluation177(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {

        int pass_count = 0;
        int total_count = 0;

        String actualReturn = "";

            try {
                total_count++;
                actualReturn = solution.getProcessId();
                String expectRes = ManagementFactory.getRuntimeMXBean().getName().split("@")[0];
                if (actualReturn == expectRes) {
                    pass_count++;
                }
            } catch (Exception e) {
            }


        return new int[]{pass_count, total_count};
    }
}
