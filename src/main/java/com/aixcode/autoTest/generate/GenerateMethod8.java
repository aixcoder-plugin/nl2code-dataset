package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod8 extends GenerateMethodBase {

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
