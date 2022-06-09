package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

public class Evaluation62 extends AbstractBaseEvaluation {


    public Evaluation62(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int[][] dataSource = new int[7][10];
        dataSource[0] = new int[]{10, 1, 10};
        dataSource[1] = new int[]{10, 10, 1};
        dataSource[2] = new int[]{10, 0, 1};
        dataSource[3] = new int[]{0, -1, 0};
        dataSource[4] = new int[]{-1, 0, 0};
        dataSource[5] = new int[]{2, 3, 3};
        dataSource[6] = new int[]{3, 2, 3};
        int pass_count = 0;
        int total_count = dataSource.length;

        for (int[] rowTest : dataSource) {
            try {
                int result = solution.combinatorial(rowTest[0], rowTest[1]);
                if(result == rowTest[2]) {
                    pass_count++;
                }
            }catch (Exception e) {

            }
        }

        return new int[]{pass_count,total_count};
    }
}
