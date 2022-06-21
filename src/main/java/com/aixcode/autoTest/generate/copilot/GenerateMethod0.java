package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.List;

public class GenerateMethod0 extends GenerateMethodBase {

    /**
     * Take a collection of Strings and return a combined string as a comma separated list with 'and' between the final pair. For example: [a, b, c] to \"a, b and c\".
     */
    public String collectionToCommaDelimitedString(List<String> coll) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < coll.size(); i++) {
            if (i == coll.size() - 1) {
                sb.append("and ");
            }
            sb.append(coll.get(i));
            if (i < coll.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
