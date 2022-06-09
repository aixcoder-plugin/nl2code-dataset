package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder253 {
    /**
     * 给一个数组，找出最大值并且返回。
     */
    public int findMaxNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxNumber = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxNumber) {
                maxNumber = nums[i];
            }
        }

        return maxNumber;
    }
}
