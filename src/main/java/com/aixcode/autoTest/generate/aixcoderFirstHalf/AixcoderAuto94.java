package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Random;

public class AixcoderAuto94 extends GenerateMethodBase {
    public int random(int[] array) {
        Random random=new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }
}
