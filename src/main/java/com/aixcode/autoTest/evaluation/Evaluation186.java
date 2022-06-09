package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

public class Evaluation186 extends AbstractBaseEvaluation {
    public Evaluation186(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {

        int pass_count = 0;
        int total_count = 0;

        boolean actualReturn = false;
            try {
                total_count++;
                actualReturn = solution.isJdk7u40Above();
                String localVersion = System.getProperty("java.version");

                int major = Integer.parseInt(localVersion.substring(0, localVersion.indexOf(".")));
                if (major >= 8) {
                    if(actualReturn) {
                        pass_count++;
                    }
                }else {
                    if (!actualReturn) {
                        pass_count++;
                    }
                }
            } catch (Exception e) {
            }
        return new int[]{pass_count, total_count};
    }
}
