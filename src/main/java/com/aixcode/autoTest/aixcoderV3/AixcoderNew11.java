package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.concurrent.ThreadLocalRandom;

public class AixcoderNew11 extends GenerateMethodBase {
    public void shuffle(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = ThreadLocalRandom.current().nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }
}
