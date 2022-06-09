package com.aixcode.autoTest.version1.aixcoder;

import java.util.Random;

public class Aixcoder241 {
    public static int random(int[] array) {
        Random random=new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }
}
