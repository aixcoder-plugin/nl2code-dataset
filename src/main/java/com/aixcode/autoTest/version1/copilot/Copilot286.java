package com.aixcode.autoTest.version1.copilot;

public class Copilot286 {
	/**
	 * 用1到n随机初始化二维数组
	 */
	public static void init(int[][] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * n) + 1;
			}
		}
	}
}
