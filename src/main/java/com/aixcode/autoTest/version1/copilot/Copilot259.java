package com.aixcode.autoTest.version1.copilot;

import java.util.List;

public class Copilot259 {

    /**
     * Take a collection of Strings and return a combined string as a comma separated list with 'and' between the final pair. For example: [a, b, c] to \"a, b and c\".
     */
    public static String collectionToCommaDelimitedString(List<String> coll) {
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
