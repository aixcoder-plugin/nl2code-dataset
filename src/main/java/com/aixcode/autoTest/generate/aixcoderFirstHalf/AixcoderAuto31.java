package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto31 extends GenerateMethodBase {
    /**
     * Returns the index of the first occurrence of the specified element in this list, returns -1 if the element is not found
     */
    public int indexOf(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }

        return -1;
    }
}
