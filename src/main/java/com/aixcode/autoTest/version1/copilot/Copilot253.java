package com.aixcode.autoTest.version1.copilot;

public class Copilot253 {

	/**
	 * 给一个数组，找出最大值并且返回。
	 */
	public int findMaxNumber(int[] nums) {
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}
}
