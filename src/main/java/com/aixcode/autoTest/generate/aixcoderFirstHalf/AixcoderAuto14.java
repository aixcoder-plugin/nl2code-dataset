package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto14 extends GenerateMethodBase {
    /**
     * 用1到n随机初始化二维数组
     */
    public void init(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int)(Math.random() * 10);
            }
        }
    }
}
