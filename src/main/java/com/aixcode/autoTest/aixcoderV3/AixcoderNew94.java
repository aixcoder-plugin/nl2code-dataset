package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Random;

public class AixcoderNew94 extends GenerateMethodBase {
    public int random(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }
        return array[new Random().nextInt(array.length)];
    }
}
