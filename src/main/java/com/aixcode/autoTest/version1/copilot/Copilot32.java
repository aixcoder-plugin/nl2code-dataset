package com.aixcode.autoTest.version1.copilot;

public class Copilot32 {
    /**
     * Returns the minimum value in an array.
     */
    public static int min(int[] array)
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
