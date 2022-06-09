package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.List;

public class AixcoderNew0 extends GenerateMethodBase {
    public String collectionToCommaDelimitedString(List<String> coll) {
        if (coll == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        final int size = coll.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(coll.get(i));
        }
        return sb.toString();
    }
}
