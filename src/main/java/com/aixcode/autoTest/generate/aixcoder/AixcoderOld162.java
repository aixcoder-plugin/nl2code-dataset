package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Stack;

public class AixcoderOld162 extends GenerateMethodBase {
    public boolean checkbracket(String str)
        {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char topChar = stack.pop();
                    if (topChar != '(') {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
} 
    }
