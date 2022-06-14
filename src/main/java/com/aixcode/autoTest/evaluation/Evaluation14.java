package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation14 extends AbstractBaseEvaluation {


    public Evaluation14(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {

        int[][] arr = new int[][]{};
        Map<Integer, int[][]> map = new HashMap<Integer, int[][]>() {{
            put(10, new int[10][10]); // range = length of array
            put(9, new int[5][5]);//range > length of array
            put(11, new int[15][15]); // range < length of array
            put(0, new int[5][5]); // max = 0 and range =0
            put(6, new int[][]{}); // length of array = 0
        }};
        int pass_count = 0;

        for (Map.Entry<Integer, int[][]> entry : map.entrySet()) {
            try {
                arr = entry.getValue();
                solution.init(arr, entry.getKey());
                boolean pass = true;
                for (int i = 0; i < entry.getValue().length; i++) {
                    for (int j = 0; j < entry.getValue()[i].length; j++) {
                        if (arr[i][j] > entry.getKey() || arr[i][j] < 0)
                            pass = false;
                        break;
                    }
                    if (!pass) {
                        break;
                    }
                }
                if (pass)
                    pass_count++;
            } catch (Exception e) {

            }
        }
        return new int[]{pass_count, map.entrySet().size()};
    }
}
