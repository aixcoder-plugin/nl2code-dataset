package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod123 extends GenerateMethodBase {

    /**
     * Returns maximum possible integer, less or equal than oldValue, divisible by quantum.
     */
    public int floor(int x, int quantum) {
        return x - x % quantum;
    }

//    public static void main(String[] args) {
//        System.out.println(10 - 10% 6);
//    }
}
