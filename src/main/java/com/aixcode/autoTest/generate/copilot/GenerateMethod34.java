package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod34 extends GenerateMethodBase {
    /**
     * Do a simple bubble sort to sort the server ids in ascending order.
     */
    public void sortServers(int[] serverIds)
    {
        for (int i = 0; i < serverIds.length; i++)
        {
            for (int j = i + 1; j < serverIds.length; j++)
            {
                if (serverIds[i] > serverIds[j])
                {
                    int temp = serverIds[i];
                    serverIds[i] = serverIds[j];
                    serverIds[j] = temp;
                }
            }
        }
    }
}
