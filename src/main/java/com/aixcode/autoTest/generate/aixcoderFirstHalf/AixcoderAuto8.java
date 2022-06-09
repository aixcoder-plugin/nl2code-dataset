package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto8 extends GenerateMethodBase {
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
