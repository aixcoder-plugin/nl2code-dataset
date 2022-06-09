package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder286 {
    /**
     * 用1到n随机初始化二维数组
     */
    public static void init(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int)(Math.random() * 10);
            }
        }
    }
}
