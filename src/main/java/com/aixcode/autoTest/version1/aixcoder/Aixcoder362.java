package com.aixcode.autoTest.version1.aixcoder;

import java.util.ArrayList;
import java.util.List;

public class Aixcoder362 {
    /**
     * Split the given sequence with the given delimiter and return list of values.
     */
    public static List<String> split(String sequence, String delimiter) {
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
