package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.ArrayList;
import java.util.List;

public class Aixcoder182 extends GenerateMethodBase {
    /**
     *  滤掉词串中的空格、标点符号
     */
    @Override
    public String[] filter(String[] word_list) {
        List<String> results = new ArrayList<String>();

        // invalid "FILTER_CHARS"
//        for (String w : word_list) {
//            if (!FILTER_CHARS.contains(w)) {
//                results.add(w.toLowerCase());
//            }
//        }

        return results.toArray(new String[results.size()]);
    }
}
