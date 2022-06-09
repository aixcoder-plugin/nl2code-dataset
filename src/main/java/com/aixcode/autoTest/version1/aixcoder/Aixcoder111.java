package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder111 {
    /**
     * Do a simple bubble sort to sort the server ids in ascending order.
     */
    public void sortServers(int[] serverIds) {
        int size = serverIds.length;
        int lowest;

        for (int i = 0; i < size; i++) {
            lowest = i;

            for (int j = i + 1; j < size; j++) {
                if (serverIds[j] < serverIds[lowest])
                    lowest = j;
            }

            if (lowest != i) {
                int temp = serverIds[i];
                serverIds[i] = serverIds[lowest];
                serverIds[lowest] = temp;
            }
        }
    }
}
