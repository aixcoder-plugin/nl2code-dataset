package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.ArrayList;
import java.util.List;

public class AixcoderAuto28 extends GenerateMethodBase {
    /**
     * Split the given sequence with the given delimiter and return list of values.
     */
    public List<String> split(String sequence, String delimiter) {
        List<String> result = new ArrayList<String>();
        int start = 0;
        int index = 0;

        while ((index = sequence.indexOf(delimiter, start)) != -1) {
            result.add(sequence.substring(start, index));
            start = index + delimiter.length();
        }

        result.add(sequence.substring(start));
        return result;
    }

}
