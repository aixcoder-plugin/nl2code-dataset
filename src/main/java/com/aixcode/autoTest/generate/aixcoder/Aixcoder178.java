package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder178 extends GenerateMethodBase {
    /**
     *  Handles comparison between version numbers (the right way(TM))，bigger return 1 ，smaller return -1 and equals return 0. Examples of version strings: 1.6.7, 1.2_b10
     */
    @Override
    public int versionCompare(String v1, String v2) {
        String[] v1Parts = v1.split("\\.");
        String[] v2Parts = v2.split("\\.");
        int i = 0;

        while (i < v1Parts.length && i < v2Parts.length && v1Parts[i].equals(v2Parts[i])) {
            i++;
        }

        if (i < v1Parts.length && i < v2Parts.length) {
            return Integer.valueOf(v1Parts[i]).compareTo(Integer.valueOf(v2Parts[i]));
        }

        return Integer.valueOf(v1Parts[i]).compareTo(Integer.valueOf(v2Parts[i]));
    }
}