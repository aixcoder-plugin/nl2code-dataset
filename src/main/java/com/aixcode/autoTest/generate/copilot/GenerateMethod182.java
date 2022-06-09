package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod182 extends GenerateMethodBase {
    /**
     *  滤掉词串中的空格、标点符号
     */
    @Override
    public String[] filter(String[] word_list) {
        if (word_list == null || word_list.length == 0) {
            return null;
        }

        String[] result = new String[word_list.length];
        int index = 0;
        for (String word : word_list) {
            if (word.length() == 0) {
                continue;
            }

            result[index++] = word.replaceAll("[\\s\\pP\\p{Punct}]", "");
        }

        return result;
    }
}
