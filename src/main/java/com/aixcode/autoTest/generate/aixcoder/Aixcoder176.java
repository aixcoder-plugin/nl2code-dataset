package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder176 extends GenerateMethodBase {
    /**
     *  Returns true if the bit at the given position is 1 and false otherwise.
     */
    @Override
    public boolean getBinaryState(int targetInteger, int position) {
        //int value = getIntegerValue(targetInteger);
        return (targetInteger & (1 << position)) > 0;
    }
}
