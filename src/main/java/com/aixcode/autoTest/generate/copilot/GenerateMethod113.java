package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod113 extends GenerateMethodBase {

    /**
     * This function takes an array of words, and returns a string with all the words in the separated by a space.
     */
    public String getStringfromStringArray(String[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i] + " ";
        }
        return result;
    }
}
