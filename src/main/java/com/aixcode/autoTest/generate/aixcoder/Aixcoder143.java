package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.regex.Pattern;

public class Aixcoder143 extends GenerateMethodBase {
    /**
     *  Returns true if the given String matches to one of the provided Patterns, false otherwise.
     */
    @Override
    public boolean matchesPattern(String _string, Pattern[] _patterns) {
        for (Pattern p : _patterns) {
            if (p.matcher(_string).matches()) {
                return true;
            }
        }

        return false;
    }
}
