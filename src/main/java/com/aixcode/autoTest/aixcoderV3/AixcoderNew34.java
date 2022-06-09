package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew34 extends GenerateMethodBase {
    public void sortServers(int[] serverIds) {
        for (int i = 0; i < serverIds.length; i++) {
            for (int j = 0; j < serverIds.length - i - 1; j++) {
                if (serverIds[j] > serverIds[j + 1]) {
                    int temp = serverIds[j];
                    serverIds[j] = serverIds[j + 1];
                    serverIds[j + 1] = temp;
                }
            }
        }
    }
}
