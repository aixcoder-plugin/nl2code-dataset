package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod106 extends GenerateMethodBase {

    /**
     * 一维数组转为二维数组，width表示列数，height表示行数
     */
    public int[][] arrayToMatrix(int[] m, int width, int height) {
        int[][] result = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = m[i * width + j];
            }
        }
        return result;
    }

}
