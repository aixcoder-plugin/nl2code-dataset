package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod118 extends GenerateMethodBase {

    /**
     * 返回不小于输入值value的最小整数
     */
    public int floor(double val) {
        return (int) Math.floor(val);
    }

    public static void main(String[] args) {
        System.out.println(new GenerateMethod118().floor(23.2));
    }
}
