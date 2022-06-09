package com.aixcode.autoTest.version1.aixcoder;

import java.util.Iterator;
import java.util.List;

public class Aixcoder259 {
    /**
     * Take a collection of Strings and return a combined string as a comma separated list with 'and' between the final pair. For example: [a, b, c] to \"a, b and c\".
     */
    public static String collectionToCommaDelimitedString(List<String> coll) {
        if (coll == null || coll.size() == 0) {
            return"";
        }

        StringBuilder sb = new StringBuilder();
        Iterator<String> it = coll.iterator();
        sb.append(it.next());

        while (it.hasNext()) {
            sb.append(",").append(it.next());
        }

        return sb.toString();
    }

}
