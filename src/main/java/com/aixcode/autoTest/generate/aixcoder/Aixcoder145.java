package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder145 extends GenerateMethodBase {
    /**
     *  判断两个数组的内容是否相等 用于equals的比较
     */
    @Override
    public boolean equals(Object[] array, Object[] other) {
        int length = array.length;

        if (length != other.length) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            if (!(array[i].equals(other[i]))) {
                return false;
            }
        }

        return true;
    }
}
