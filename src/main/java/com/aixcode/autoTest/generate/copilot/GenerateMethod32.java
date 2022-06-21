package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod32 extends GenerateMethodBase {
    /**
     * Returns the minimum value in an array.
     */
    public int min(int[] array)
    {
        int min = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] < min)
            {
                min = array[i];
            }
        }
        return min;
    }

}
