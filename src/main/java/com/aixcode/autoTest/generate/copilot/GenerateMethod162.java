package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod162 extends GenerateMethodBase {
    /**
     * 括号匹配检测.
     */
    public boolean checkbracket(String str) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                left++;
            } else if (str.charAt(i) == ')') {
                right++;
            }
        }
        return left == right;
    }
}
