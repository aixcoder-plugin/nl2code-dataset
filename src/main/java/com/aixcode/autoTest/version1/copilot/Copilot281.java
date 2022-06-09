package com.aixcode.autoTest.version1.copilot;

public class Copilot281 {
    /**
     * Returns the index of the first occurrence of the specified element in this list, returns -1 if the element is not found
     */
    public static int indexOf(int[] array, int element)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == element)
            {
                return i;
            }
        }
        return -1;
    }
}
