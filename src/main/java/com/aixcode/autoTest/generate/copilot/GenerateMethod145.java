package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod145 extends GenerateMethodBase {
    /**
     *  判断两个数组的内容是否相等 用于equals的比较
     */
    @Override
    public boolean equals(Object[] array, Object[] other) {
        if (array == null || other == null) {
            return false;
        }
        if (array.length != other.length) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(other[i])) {
                return false;
            }
        }
        return true;
    }
}
