package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.regex.Pattern;

public class GenerateMethod143 extends GenerateMethodBase {
    /**
     *  Returns true if the given String matches to one of the provided Patterns, false otherwise.
     */
    @Override
    public boolean matchesPattern(String _string, Pattern[] _patterns)
    {
        for (Pattern pattern : _patterns)
        {
            if (pattern.matcher(_string).matches())
            {
                return true;
            }
        }
        return false;
    }
}
