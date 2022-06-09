package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;

public class Check67 extends BaseAbstractTest {

    @Override
    public int[] checkCopilot() {
        System.out.println("line number 67: copilot code can't run");
        return new int[]{0, 0};
    }

    @Override
    public int[] checkAixcoder() {
        System.out.println("line number 67: aixcoder code can't run");
        return new int[]{0, 0};
    }
}
