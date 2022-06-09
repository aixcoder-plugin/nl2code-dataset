package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class AixcoderNew28 extends GenerateMethodBase {
    public java.util.List<String> split(String sequence, String delimiter) {
// first split string into individual tokens - then split each token
        java.util.List<String> tokens = new ArrayList<>();
// use delimiter to split token sequence
        StringTokenizer tokenizer = new StringTokenizer(sequence, delimiter);
        while (tokenizer.hasMoreTokens()) {
            tokens.add(tokenizer.nextToken());
        }
        return tokens;
    }
}
