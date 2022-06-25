package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderOld106 extends GenerateMethodBase {
    public int[][] arrayToMatrix(int[] m, int width, int height) {
        int[][] result = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int p = j * height + i;
                result[i][j] = m[p];
            }
        }
        return result;
    }
}
